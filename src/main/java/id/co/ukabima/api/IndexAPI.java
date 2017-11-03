package id.co.ukabima.api;

import id.co.ukabima.repository.AgamaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class IndexAPI {

    @Autowired
    private AgamaRepository agamaRepository;

    @GetMapping("/halo")
    public String haloController() {
        agamaRepository.findAll();
        return "Halo World";
    }
}
