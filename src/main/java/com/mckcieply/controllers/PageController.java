package com.mckcieply.controllers;

import com.mckcieply.models.Contact;
import com.mckcieply.services.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
        model.addAttribute("contact",new Contact());
        return "contact";
    }

    @PostMapping("/index")
    public String leaveContact(@ModelAttribute Contact contact){
        contactService.save(contact);

        return "index";
    }

    @RequestMapping(value ="/allContacts")
    public String getAll(Model model){
        List<Contact> contacts = contactService.getAll();
        model.addAttribute("contactsList", contacts);
        return "contacts";
    }
}
