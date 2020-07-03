package io.glimpse.springsecurityjdbc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeResource {

    @GetMapping("/")
    public String home(){
        return ("<H1>Welcome Home</H1>");
    }

    @GetMapping("/user")
    public String userHome(){
        return ("<H1>Welcome to User Home</H1>");
    }

    @GetMapping("/admin")
    public String adminHome() {
        return ("<H1>Welcome to Admin Home</H1>");
    }
}
