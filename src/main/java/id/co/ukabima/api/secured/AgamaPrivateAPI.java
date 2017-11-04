package id.co.ukabima.api.secured;

import id.co.ukabima.model.master.Agama;
import id.co.ukabima.plugins.PageCounter;
import id.co.ukabima.repository.AgamaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/private/api/agama")
public class AgamaPrivateAPI {

    @Autowired
    private AgamaRepository agamaRepository;

    @GetMapping(value = "/list", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Map<String, Object> list(
            @RequestParam Integer iDisplayStart,
            @RequestParam Integer iDisplayLength,
            @RequestParam String nama) {
        Map<String, Object> param = new HashMap<>();

        Integer sizeOf = Math.toIntExact(agamaRepository.count());
        PageCounter pageCounter = new PageCounter(sizeOf, iDisplayLength, iDisplayStart);

        PageRequest pageRequest = new PageRequest(pageCounter.currentPage(), iDisplayLength);
        Page<Agama> agamaContent = agamaRepository.findAll(pageRequest);

//        data element
        param.put("aaData", agamaContent.getContent());
//        jumlah data berdasarkan filter
        param.put("iTotalRecords", agamaContent.getNumberOfElements());
//        jumlah data keseluruhan
        param.put("iTotalDisplayRecords", sizeOf);
        return param;
    }
}
