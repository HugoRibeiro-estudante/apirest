package com.iftm.apirest.services;

import com.iftm.apirest.models.Email;
import com.iftm.apirest.repositories.EmailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmailService {

    @Autowired
    private EmailRepository emailRepository;

    public List<Email> getAllEmail(){
        return emailRepository.findAll();
    }

    public Optional<Email> getById(Long id){
        return emailRepository.findById(id);
    }

    public Email Save(Email email){
        return emailRepository.save(email);
    }

    public Email update(Email email){
        var dbEmail = emailRepository.findById(email.getId());
        if(dbEmail.isPresent()){
            return emailRepository.save(email);
        }
        return null;
    }

    public String delete(Long id){
        var dbEmail = emailRepository.findById(id);
        if(dbEmail.isPresent()) {
            emailRepository.deleteById(id);
            return "Email id " + id + " has been deleted!";
        }else
            return "ID " + id + " not found!";
    }

}
