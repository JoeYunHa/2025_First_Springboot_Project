package com.example.firstproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller // Declare this class as Controller with using Annotation
public class FirstController {
    private final String username = "JJ";
    @GetMapping("/hi")
    public String niceToMeetYou(Model model){
        // Model connects attribute value with attribute name and send to web browser
        model.addAttribute("username", username);
        return "greetings"; // return greetings.mustache
    }

    @GetMapping("/bye")
    public String SeeYouNext(Model model){
        model.addAttribute("username", username);
        return "goodbye";
    }
}
