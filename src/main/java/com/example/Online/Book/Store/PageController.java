package com.example.Online.Book.Store;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {
   @GetMapping("/")
   public String signup() {
       return "signup";
   }
    @GetMapping("/login")
    public String login() {
        return "login";
    }


}
