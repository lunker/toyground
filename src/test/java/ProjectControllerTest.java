import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.lunker.toyground.Application;
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
import java.util.List;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.hamcrest.Matchers.equalTo;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

/**
 * Created by dongqlee on 2018. 1. 8..
 */


@RunWith(SpringRunner.class)
//@SpringBootTest(classes = ProjectControllerTest.class)
@SpringBootTest(classes = Application.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
//@AutoConfigureMockMvc
public class ProjectControllerTest {

    @Autowired
    private TestRestTemplate restTemplate;

//    @Autowired
//    private MockMvc mvc;

    private URL base;

    @Before
    public void setUp() throws Exception {
        this.base = new URL("http://localhost:8080");
    }

    @Test
    public void testCreateProject() throws Exception{
        ProjectEntity projectEntity=new ProjectEntity("test project", "https://github.com/lunker/toyground");

        ResponseEntity<Void> responseEntity=restTemplate.postForEntity("/api/project", projectEntity, null);
        Assert.assertEquals(responseEntity.getStatusCode(), HttpStatus.OK);
    }

    @Test
    public void testGetProjectList() throws Exception{
        ResponseEntity<List<ProjectEntity>> responseEntity=restTemplate.getForObject("/api/project", ResponseEntity.class);

        Assert.assertEquals(HttpStatus.OK,responseEntity.getStatusCode());
    }

    @Test
    public void testDeleteProjectList() throws Exception{

    }

    @Test
    public void testModifyProject() throws Exception{

    }
}
