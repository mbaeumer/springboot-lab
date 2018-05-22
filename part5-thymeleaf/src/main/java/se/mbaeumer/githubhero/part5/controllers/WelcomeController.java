package se.mbaeumer.githubhero.part5.controllers;

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
