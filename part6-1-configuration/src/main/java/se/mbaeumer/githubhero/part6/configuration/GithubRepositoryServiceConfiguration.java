package se.mbaeumer.githubhero.part6.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

/**
 * Created by martinbaumer on 2018-06-10.
 */
@Configuration
public class GithubRepositoryServiceConfiguration {
    @Value("${github.base.url}")
    private String githubBaseUrl;

    @Value("${github.user.path}")
    private String githubUserPath;

    @Value("${github.userrepo.path}")
    private String githubUserRepos;

    public String getGithubBaseUrl() {
        return githubBaseUrl;
    }

    public String getGithubUserPath() {
        return githubUserPath;
    }

    public String getGithubUserRepos() {
        return githubUserRepos;
    }
}
