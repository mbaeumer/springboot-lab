package se.mbaeumer.githubhero.part6.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
    @RequestMapping(value="/welcome", method= RequestMethod.GET)
    public String welcome(){
        return "welcome";
    }
}
