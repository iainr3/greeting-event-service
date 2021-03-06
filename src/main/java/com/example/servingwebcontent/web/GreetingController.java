package com.example.servingwebcontent.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {

    @GetMapping("/greeting")
    public String greeting(@RequestParam(name = "name", required = false,
            defaultValue = "World") String name, @RequestParam(name = "day", required = false,
            defaultValue = "day") String day, Model model) {
        model.addAttribute("name", name);
        model.addAttribute("day", day);
        return "greeting";
    }
}
