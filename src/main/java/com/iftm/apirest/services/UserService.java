package com.iftm.apirest.services;

import com.iftm.apirest.models.Email;
import com.iftm.apirest.models.User;
import com.iftm.apirest.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUsers(){
        return userRepository.findAll();
    }

    public Optional<User> getById(Long id){
        return userRepository.findById(id);
    }

    public User save(User user){
        return userRepository.save(user);
    }

    public User update(User user){
        var dbUser = userRepository.findById(user.getId());
        if(dbUser.isPresent()){
            return userRepository.save(user);
        }
        return null;
    }

    public String  delete(Long id){
        var dbUser = userRepository.findById(id);
        if(dbUser.isPresent()) {
            userRepository.deleteById(id);
            return "User id " + id + " has been deleted!";
        }else
            return "ID " + id + " not found!";
    }

}
