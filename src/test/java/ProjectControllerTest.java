import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.net.URL;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.hamcrest.Matchers.equalTo;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

/**
 * Created by dongqlee on 2018. 1. 8..
 */


@RunWith(SpringRunner.class)
@SpringBootTest(classes = ProjectControllerTest.class)
@AutoConfigureMockMvc
public class ProjectControllerTest {

    @Autowired
    private MockMvc mvc;

//    @LocalServerPort
    private int port=8080;

    private URL base;


    /*
    @Autowired
    private TestRestTemplate template;
    */


    @Before
    public void setUp() throws Exception {
        this.base = new URL("http://localhost:" + port + "/");
    }

    @Test
    public void getHello() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/as").accept(MediaType.APPLICATION_JSON));
//                .andExpect(status().isOk())
//                .andExpect(content().string(equalTo("1")));
        System.out.println(content().toString());

    }

    /*
    @Test
    public void getHello2() throws Exception {
        ResponseEntity<String> response = template.getForEntity(base.toString(),
                String.class);

        Assert.assertThat(response.getBody(), equalTo("Greetings from Spring Boot!"));
    }
    */

}
