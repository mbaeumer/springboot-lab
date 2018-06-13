package se.mbaeumer.githubhero.part6.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import se.mbaeumer.githubhero.part6.config.GithubRepositoryServiceConfiguration;

import java.util.Arrays;
import java.util.List;

@Service
public class GithubRepositoryService {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private GithubRepositoryServiceConfiguration configuration;

    public List<Repository> getRepositoriesForUser(String username) {
        ResponseEntity<Repository[]> responseEntity = restTemplate.getForEntity(
                String.format(configuration.getBaseUrl() + configuration.getUserPath() + "%s/"
                        + configuration.getUserRepoPath(), username), Repository[].class);
        Repository[] response =  responseEntity.getBody();
        return Arrays.asList(response);
    }
}