package se.mbaeumer.springboot.udemy.jokeapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import se.mbaeumer.springboot.udemy.jokeapp.services.JokeService;

@Controller
public class JokeController {

    @Autowired
    private JokeService jokeService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String getJokes(Model model){
        model.addAttribute("joke", jokeService.getJoke());
        return "chucknorris";
    }
}
