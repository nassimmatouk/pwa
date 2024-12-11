package com.example.controller;

import com.example.entities.Sample;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;

import java.util.Arrays;
import java.util.List;

@Controller
public class LaboratoryController {

    // Mapping pour la page Thymeleaf affichant les échantillons
    @GetMapping("/")
    public String homePage(Model model) {
        List<Sample> samples = Arrays.asList(
                new Sample("Echantillon 1", "Plante", "Description de l'échantillon 1", "Analysé"),
                new Sample("Echantillon 2", "Sang", "Description de l'échantillon 2", "En attente")
        );
        model.addAttribute("samples", samples);
        return "index"; // Nom de la page Thymeleaf
    }

    // Exposer une API REST pour récupérer les échantillons
    @RestController
    public class ApiController {
        @GetMapping("/api/samples")
        public List<Sample> getSamples() {
            return Arrays.asList(
                    new Sample("Echantillon 1", "Plante", "Description de l'échantillon 1", "Analysé"),
                    new Sample("Echantillon 2", "Sang", "Description de l'échantillon 2", "En attente")
            );
        }
    }
}
