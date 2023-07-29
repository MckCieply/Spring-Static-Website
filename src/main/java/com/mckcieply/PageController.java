package com.mckcieply;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class PageController {

    @Autowired
    private ContactService contactService;


    @RequestMapping(value = "/")
    public String index() {
        return "index";
    }

    @RequestMapping(value = "/countries")
    public String countries() {
        return "countries";
    }

    @RequestMapping(value = "/contact")
    public String contact(Model model) {
        model.addAttribute("contact",new ContactForm());
        return "contact";
    }

    @PostMapping("/index")
    public String leaveContact(@ModelAttribute ContactForm contactForm){
        System.out.println(contactForm.toString());

        return "index";
    }

    @RequestMapping(value ="/allContacts")
    public String getAll(Model model){
        List<ContactForm> contacts = contactService.getAll();
        model.addAttribute("contactsList", contacts);
        return "contacts";
    }
}
