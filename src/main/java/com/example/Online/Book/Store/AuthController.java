 package com.example.Online.Book.Store;
 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.stereotype.Controller;
 import org.springframework.web.bind.annotation.*;

 @Controller
 public class AuthController {
     @Autowired
     private UserService service;

     @PostMapping("/signup")
     public String signup(User user) {
         // Encrypt password before saving (recommended)
         service.save(user);
        return "redirect:/login";
    }
     @PostMapping("/")
    public String login(@RequestParam String username, @RequestParam String password) {
        User user = service.findByUsername(username);
        if (user != null && user.getPassword().equals(password)) {
            // Basic example; use Spring Security for real apps
             return "redirect:/signup";
         }
         return "redirect:/login?error";
   }
 }
