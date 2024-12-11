package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

    @GetMapping("/home") // Cette URL doit correspondre
    public String home(Model model) {
        model.addAttribute("message", "Bienvenue dans votre laboratoire !");
        return "home"; // Le nom du fichier home.html dans le répertoire templates
    }


@GetMapping("/greet")
public String greet(@RequestParam String name, Model model) {
    model.addAttribute("greeting", "Bonjour " + name + "!");
    return "greet";  // Correspond à un fichier greet.html dans templates
}
}

