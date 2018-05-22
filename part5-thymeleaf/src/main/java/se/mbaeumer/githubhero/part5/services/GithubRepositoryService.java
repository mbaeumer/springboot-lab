package se.mbaeumer.githubhero.part5.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Service
public class GithubRepositoryService {

    @Autowired
    private RestTemplate restTemplate;

    public List<Repository> getRepositoriesForUser(String username) {
        ResponseEntity<Repository[]> responseEntity = restTemplate.getForEntity(String.format("https://api.github.com/users/%s/repos", username), Repository[].class);
        Repository[] response =  responseEntity.getBody();
        return Arrays.asList(response);
    }
}