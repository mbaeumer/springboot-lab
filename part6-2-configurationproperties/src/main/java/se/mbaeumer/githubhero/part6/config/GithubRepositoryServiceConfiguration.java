package se.mbaeumer.githubhero.part6.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * Created by martinbaumer on 2018-06-10.
 */
@ConfigurationProperties(prefix = "github.api")
public class GithubRepositoryServiceConfiguration {
    private String baseUrl;

    private String userPath;

    private String userRepoPath;

    public void setBaseUrl(String baseUrl) {
        this.baseUrl = baseUrl;
    }

    public void setUserPath(String userPath) {
        this.userPath = userPath;
    }

    public void setUserRepoPath(String userRepoPath) {
        this.userRepoPath = userRepoPath;
    }

    public String getBaseUrl() {
        return baseUrl;
    }

    public String getUserPath() {
        return userPath;
    }

    public String getUserRepoPath() {
        return userRepoPath;
    }
}
