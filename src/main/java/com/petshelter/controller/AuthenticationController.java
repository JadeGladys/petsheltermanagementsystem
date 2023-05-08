package com.petshelter.controller;

import com.petshelter.model.User;
import com.petshelter.service.UserService;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AuthenticationController {
    private UserService userService;

    public AuthenticationController(UserService userService) {
        this.userService = userService;
    }

    //The login page authentication

    //Get the login page
    @GetMapping("/login")
    public String showLoginForm(Model model) {
        model.addAttribute("loginForm", new User());
        return "login";
    }

    //check login credentials
    /*@PostMapping("/login")
    public String processLoginForm(@Valid User loginForm, BindingResult bindingResult, Model model) {

        if (bindingResult.hasErrors()) {
            return "login";
        }

        User user = userService.findByEmail(loginForm.getEmail());

        if (user == null) {
            model.addAttribute("invalidCredentials", true);
            return "login";
        }

        boolean authenticated = userService.authenticateUser(user, loginForm.getPassword());

        if (!authenticated) {
            model.addAttribute("invalidCredentials", true);
            return "login";
        }

        userService.login(user);

        return "redirect:/dashboard";
    }*/
}
