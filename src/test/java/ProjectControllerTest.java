import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.lunker.toyground.model.ProjectEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.data.web.ProjectedPayload;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;

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

//    @Autowired
//    private TestRestTemplate restTemplate;

    @Autowired
    private MockMvc mvc;

    private URL base;

    @Before
    public void setUp() throws Exception {
        this.base = new URL("http://localhost:8080");
    }

    /*
    @Test
    public void getHello() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/as").accept(MediaType.APPLICATION_JSON));
    }
    */


    @Test
    public void testCreateProject() throws Exception{
        ProjectEntity projectEntity=new ProjectEntity();

//        ResponseEntity<Void> responseEntity=this.restTemplate.postForEntity("/api/project", projectEntity, null);

//        Assert.assertEquals(responseEntity.getStatusCode(), HttpStatus.OK);


        this.mvc.perform(MockMvcRequestBuilders.get("/api/project"))
                .andDo(MockMvcResultHandlers.print())
                .andExpect(status().isOk());
    }

    @Test
    public void testGetProjectList() throws Exception{

    }


}
