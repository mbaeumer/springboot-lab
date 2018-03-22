package se.mbaeumer.githubhero.part4;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import se.mbaeumer.githubhero.part4.controllers.WelcomeController;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(WelcomeController.class)
public class WelcomeControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testWelcome() throws Exception{
        MvcResult result = mockMvc.perform(get("/welcome")).andExpect(status().isOk()).andReturn();
        String response = result.getResponse().getContentAsString();
        Assert.assertTrue(response.equalsIgnoreCase("Welcome"));
    }
}
