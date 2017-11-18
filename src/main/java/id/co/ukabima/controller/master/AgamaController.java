package id.co.ukabima.controller.master;

import id.co.ukabima.model.master.Agama;
import id.co.ukabima.service.AgamaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
@RequestMapping("/agama")
public class AgamaController {

    @Autowired
    private AgamaService agamaService;

    @GetMapping("/list")
    public String list() {
        return "pages/master/agama/index";
    }

    @GetMapping(value = {"/form", "/form/{id}"})
    public String form(
            @PathVariable(required = false, name = "id") Agama agama,
            Model model) {
        if (agama == null)
            agama = new Agama();
        model.addAttribute("agama", agama);
        return "pages/master/agama/form";
    }

    @PostMapping(value = "/submit")
    public String submit(@Valid @ModelAttribute Agama agama) {
        this.agamaService.save(agama);
        return "redirect:/agama/list";
    }
}
