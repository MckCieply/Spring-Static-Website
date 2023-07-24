package com.mckcieply;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class pageController {
    @RequestMapping(value = "/")
    public String index() {
        return "index";
    }

    @RequestMapping(value = "/countries")
    public String countries() {
        return "countries";
    }

    @RequestMapping(value = "/contact")
    public String contact() {
        return "contact";
    }
}
