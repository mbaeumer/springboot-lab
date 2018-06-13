package se.mbaeumer.githubhero.part6;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import se.mbaeumer.githubhero.part6.config.GithubRepositoryServiceConfiguration;

@SpringBootApplication
@EnableConfigurationProperties(GithubRepositoryServiceConfiguration.class)
public class SpringBootLabGithubHeroApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringBootLabGithubHeroApplication.class, args);
	}
	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
}
