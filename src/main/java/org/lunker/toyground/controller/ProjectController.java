package org.lunker.toyground.controller;

import io.swagger.annotations.ApiOperation;
import org.lunker.toyground.model.ProjectEntity;
import org.lunker.toyground.repository.ProjectRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.HttpRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by dongqlee on 2018. 1. 8..
 */

@Controller
@EnableAutoConfiguration
@RequestMapping("/api/project")
public class ProjectController {

    private Logger logger= LoggerFactory.getLogger(ProjectController.class);

    @Autowired
    private ProjectRepository projectRepository;

    @ApiOperation(value="Project 등록")
    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity create(@RequestBody ProjectEntity projectEntity, HttpServletRequest httpServletRequest){
        ProjectEntity savedEntity=projectRepository.save(projectEntity);

        logger.info("[POST][/api/project]");
        logger.info(projectEntity.toString());

        logger.info("Saved result : " + savedEntity.toString());

//        ResponseEntity<String> test=new ResponseEntity<String>("body!", HttpStatus.OK);
//        return test;
        return new ResponseEntity(HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<ProjectEntity>> getProjectList(){
//        ServerResponse response=null;

        return new ResponseEntity(HttpStatus.OK);
    }
}
