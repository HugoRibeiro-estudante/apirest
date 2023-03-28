package com.iftm.apirest.controllers;

import com.iftm.apirest.models.Email;
import com.iftm.apirest.services.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/v1")
public class EmailController {

    @Autowired
    private EmailService emailService;

    @GetMapping("email")
    public List<Email> getAllEmails(){
        return emailService.getAllEmails();
    }

    @GetMapping("email/{id}")
    public Optional<Email> find(@PathVariable("id") Long id){
        return emailService.getById(id);
    }

    @PostMapping("email")
    public Email save(@RequestBody Email email){
        return emailService.save(email);
    }

    @PutMapping("email")
    public Email update(@RequestBody Email email){
        return emailService.update(email);
    }

    @DeleteMapping("email/{id}")
    public String delete(@PathVariable("id") Long id){
        return emailService.delete(id);
    }

}
