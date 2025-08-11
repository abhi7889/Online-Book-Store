 package com.example.Online.Book.Store;

 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.stereotype.Service;

 @Service
 public class UserService {
     @Autowired
     private UserRepository repo;

     public User save(User user) {
         return repo.save(user);
    }

    public User findByUsername(String username) {
        return repo.findByUsername(username);
    }
}

