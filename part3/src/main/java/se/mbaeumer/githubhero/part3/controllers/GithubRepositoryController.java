package se.mbaeumer.githubhero.part3.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import se.mbaeumer.githubhero.part3.services.GithubRepositoryService;
import se.mbaeumer.githubhero.part3.services.Repository;

import java.util.List;

@RestController
public class GithubRepositoryController {

    @Autowired
    private GithubRepositoryService githubRepositoryService;

    @RequestMapping(value="/repos/{username}", method= RequestMethod.GET)
    public List<Repository> getRepositories(@PathVariable String username){
        return githubRepositoryService.getRepositoriesForUser(username);
    }
}
