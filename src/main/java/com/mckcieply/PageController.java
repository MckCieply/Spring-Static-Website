package com.mckcieply;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class PageController {
    private final ContactRepository contactRepository;

    public PageController(ContactRepository contactRepository) {
        this.contactRepository = contactRepository;
    }

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
    public String contacts(){
        return "contacts";
    }
    @RequestMapping(value ="/temp")
    public ResponseEntity getAllContacts() {
        return ResponseEntity.ok(this.contactRepository.findAll());
    }
}
