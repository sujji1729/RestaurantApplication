package com.example.restaurantApplication.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class restaurantController {

    // @GetMapping(value = "/")
    // public String homePage() {
    // return "welcome to our restaurantApplication";
    // }

    @GetMapping(value = "/home")
    public String homePage() {
        return "homePage";
    }

    @GetMapping(value = "/about")
    public String aboutPage() {
        return "about";
    }

    @GetMapping(value = "/service")
    public String servicePage() {
        return "service";
    }

    @GetMapping(value = "/menu")
    public String menuPage() {
        return "menu";
    }

    @GetMapping(value = "/contact")
    public String contactPage() {
        return "contact";
    }

    @GetMapping(value = "/bookATable")
    public String bookAPage() {
        return "bookATable";
    }

    @GetMapping(value = "/galary")
    public String galayPage() {
        return "galary";
    }

}
