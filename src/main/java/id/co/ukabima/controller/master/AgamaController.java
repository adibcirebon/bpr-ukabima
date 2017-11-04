package id.co.ukabima.controller.master;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/agama")
public class AgamaController {

    @GetMapping("/list")
    public String list() {
        return "pages/master/agama/index";
    }
}
