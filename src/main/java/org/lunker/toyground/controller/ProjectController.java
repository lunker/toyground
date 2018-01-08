package org.lunker.toyground.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by dongqlee on 2018. 1. 8..
 */

@Controller
@EnableAutoConfiguration
public class ProjectController {


    private Logger logger= LoggerFactory.getLogger(ProjectController.class);

    @RequestMapping("/")
    String hello() {
        logger.debug("url :: /" );
        logger.info("url :: /" );
        return "index.html";
    }
}
