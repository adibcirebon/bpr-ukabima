package ukabima.co.id.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ukabima.co.id.repository.AgamaRepository;

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
