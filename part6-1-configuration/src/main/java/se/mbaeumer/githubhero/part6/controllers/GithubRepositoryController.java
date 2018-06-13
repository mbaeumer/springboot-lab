package se.mbaeumer.githubhero.part6.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import se.mbaeumer.githubhero.part6.services.GithubRepositoryService;

@Controller
public class GithubRepositoryController {

    private GithubRepositoryService githubRepositoryService;

    public GithubRepositoryController(GithubRepositoryService githubRepositoryService) {
        this.githubRepositoryService = githubRepositoryService;
    }

    @RequestMapping(value="/repos/{username}", method= RequestMethod.GET)
    public String getRepositories(Model model, @PathVariable String username){
        model.addAttribute("repos", githubRepositoryService.getRepositoriesForUser(username));
        model.addAttribute("user", username);
        return "repositories";
    }
}
