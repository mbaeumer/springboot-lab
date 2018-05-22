package se.mbaeumer.githubhero.part5;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.client.MockRestServiceServer;
import org.springframework.web.client.RestTemplate;
import se.mbaeumer.githubhero.part5.services.GithubRepositoryService;
import se.mbaeumer.githubhero.part5.services.Repository;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.requestTo;
import static org.springframework.test.web.client.response.MockRestResponseCreators.withSuccess;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GithubRepositoryServiceTest {
    @Autowired
    RestTemplate restTemplate;

    @Autowired
    GithubRepositoryService service;

    private MockRestServiceServer mockServer;

    @Before
    public void setUp() {
        mockServer = MockRestServiceServer.createServer(restTemplate);
    }

    @Test
    public void testGetRepositories() {

        String expectedResponseBody="[{\"name\":\"angular-ots-custom-navbar\",\"owner\":{\"login\":\"mbaeumer\",\"id\":5737140,\"avatarUrl\":null,\"url\":\"https://api.github.com/users/mbaeumer\"},\"url\":\"https://api.github.com/repos/mbaeumer/angular-ots-custom-navbar\"},{\"name\":\"angular-ots-notify\",\"owner\":{\"login\":\"mbaeumer\",\"id\":5737140,\"avatarUrl\":null,\"url\":\"https://api.github.com/users/mbaeumer\"},\"url\":\"https://api.github.com/repos/mbaeumer/angular-ots-notify\"},{\"name\":\"codehero-springboot-samples\",\"owner\":{\"login\":\"mbaeumer\",\"id\":5737140,\"avatarUrl\":null,\"url\":\"https://api.github.com/users/mbaeumer\"},\"url\":\"https://api.github.com/repos/mbaeumer/codehero-springboot-samples\"},{\"name\":\"fiftyseven\",\"owner\":{\"login\":\"mbaeumer\",\"id\":5737140,\"avatarUrl\":null,\"url\":\"https://api.github.com/users/mbaeumer\"},\"url\":\"https://api.github.com/repos/mbaeumer/fiftyseven\"},{\"name\":\"fxlink\",\"owner\":{\"login\":\"mbaeumer\",\"id\":5737140,\"avatarUrl\":null,\"url\":\"https://api.github.com/users/mbaeumer\"},\"url\":\"https://api.github.com/repos/mbaeumer/fxlink\"},{\"name\":\"glucosediary\",\"owner\":{\"login\":\"mbaeumer\",\"id\":5737140,\"avatarUrl\":null,\"url\":\"https://api.github.com/users/mbaeumer\"},\"url\":\"https://api.github.com/repos/mbaeumer/glucosediary\"},{\"name\":\"mbaeumer.github.io\",\"owner\":{\"login\":\"mbaeumer\",\"id\":5737140,\"avatarUrl\":null,\"url\":\"https://api.github.com/users/mbaeumer\"},\"url\":\"https://api.github.com/repos/mbaeumer/mbaeumer.github.io\"},{\"name\":\"papp2017\",\"owner\":{\"login\":\"mbaeumer\",\"id\":5737140,\"avatarUrl\":null,\"url\":\"https://api.github.com/users/mbaeumer\"},\"url\":\"https://api.github.com/repos/mbaeumer/papp2017\"},{\"name\":\"python-challenge\",\"owner\":{\"login\":\"mbaeumer\",\"id\":5737140,\"avatarUrl\":null,\"url\":\"https://api.github.com/users/mbaeumer\"},\"url\":\"https://api.github.com/repos/mbaeumer/python-challenge\"},{\"name\":\"springboot-lab\",\"owner\":{\"login\":\"mbaeumer\",\"id\":5737140,\"avatarUrl\":null,\"url\":\"https://api.github.com/users/mbaeumer\"},\"url\":\"https://api.github.com/repos/mbaeumer/springboot-lab\"},{\"name\":\"vtri\",\"owner\":{\"login\":\"mbaeumer\",\"id\":5737140,\"avatarUrl\":null,\"url\":\"https://api.github.com/users/mbaeumer\"},\"url\":\"https://api.github.com/repos/mbaeumer/vtri\"}]";

        mockServer.expect(requestTo("https://api.github.com/users/mbaeumer/repos")).andRespond(withSuccess(expectedResponseBody, MediaType.APPLICATION_JSON));

        List<Repository> result = service.getRepositoriesForUser("mbaeumer");
        System.out.println("testGetRootResource: " + result);

        mockServer.verify();
        assertEquals(11, result.size());
    }
}
