package id.co.ukabima.controller;

import id.co.ukabima.model.security.User;
import id.co.ukabima.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @Autowired
    private UserService userService;

    @GetMapping(value = {"/", "/home"})
    public String homeApplication(Model model) {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if (authentication.isAuthenticated() &&
                !(authentication instanceof AnonymousAuthenticationToken)) {
            User user = userService.findByUsername(authentication.getName());
            model.addAttribute("user", user);
            return user.isNasabah() ? "pages/nasabah" : "pages/staff";
        } else
            return "pages/index";
    }
}
