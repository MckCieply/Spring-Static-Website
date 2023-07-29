package com.mckcieply;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactService {

    @Autowired
    private ContactRepository contactRepository;

    public List<ContactForm> getAll(){
        return contactRepository.findAll();
    }
}
