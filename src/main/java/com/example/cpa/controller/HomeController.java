package com.example.cpa.controller;

import com.example.cpa.model.ContactForm;
import jakarta.validation.Valid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {

    private static final Logger log = LoggerFactory.getLogger(HomeController.class);

    @GetMapping({"/", "/home"})
    public String home() {
        return "index";
    }

    @GetMapping("/services")
    public String services() {
        return "services";
    }

    @GetMapping("/about")
    public String about() {
        return "about";
    }

    @GetMapping("/team")
    public String team() {
        return "team";
    }

    @GetMapping("/privacy")
    public String privacy() {
        return "privacy";
    }

    @GetMapping("/contact")
    public String contact(Model model) {
        model.addAttribute("contactForm", new ContactForm());
        return "contact";
    }

    @PostMapping("/contact")
    public String handleContact(@Valid @ModelAttribute("contactForm") ContactForm form,
                                BindingResult bindingResult,
                                Model model) {
        if (bindingResult.hasErrors()) {
            return "contact";
        }
        // In a real site, you'd send an email or store the message.
        log.info("Contact submission: name='{}' email='{}' phone='{}' subject='{}' message='{}'",
                form.getName(), form.getEmail(), form.getPhone(), form.getSubject(), form.getMessage());
        model.addAttribute("success", true);
        return "contact";
    }
}
