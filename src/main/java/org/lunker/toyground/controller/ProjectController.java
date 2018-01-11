package org.lunker.toyground.controller;

import org.lunker.toyground.annotation.RequestAPI;
import org.lunker.toyground.core.ServerResponse;
import org.lunker.toyground.model.ProjectEntity;
import org.lunker.toyground.repository.ProjectRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

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

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity create(@RequestBody ProjectEntity projectEntity){
//        ServerResponse response=null;

        ProjectEntity savedEntity=projectRepository.save(projectEntity);

        logger.info("[POST][/api/project]");
        logger.info(projectEntity.toString());

        logger.info("Saved result : " + savedEntity.toString());

        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<ProjectEntity>> getProjectList(){
//        ServerResponse response=null;s

        return new ResponseEntity<List<ProjectEntity>>(HttpStatus.OK);
    }
}
