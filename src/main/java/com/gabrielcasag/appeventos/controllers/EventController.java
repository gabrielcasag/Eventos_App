package com.gabrielcasag.appeventos.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EventController {

    @RequestMapping("/event/new")
    public String form() {
        return "/event/eventForm";
    }
}
