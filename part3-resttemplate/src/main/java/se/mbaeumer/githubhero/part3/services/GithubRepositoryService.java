package se.mbaeumer.githubhero.part3.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Service
public class GithubRepositoryService {

    @Autowired
    private RestTemplate restTemplate;

    public List<Repository> getRepositoriesForUser(String username) {
        Repository[] response =  restTemplate.getForEntity(String.format("https://api.github.com/users/%s/repos", username), Repository[].class).getBody();
        return Arrays.asList(response);
    }
}