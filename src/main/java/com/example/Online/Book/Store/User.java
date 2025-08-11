 package com.example.Online.Book.Store;

 import org.springframework.data.mongodb.core.mapping.Document;
 @Document("users")
// // class definition and fields here
 public class User {
    // your fields, e.g. private String password;
    private String password;

    public String getPassword() {
        return password;
    }

     public void setPassword(String password) {
        this.password = password;
    }
    private String username;
 private String email;

 public String getUsername() { return username; }
 public void setUsername(String username) { this.username = username; }

 public String getEmail() { return email; }
 public void setEmail(String email) { this.email = email; }

}
