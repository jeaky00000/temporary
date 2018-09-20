package com.example.demo.Controller;

import com.example.demo.model.Project;
import com.example.demo.services.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/project")
public class ProjectController {
    @Autowired
    private ProjectService projectService;

    @ResponseBody
    @RequestMapping(value = "/all/{pageNum}/{pageSize}", produces = {"application/json;charset=UTF-8"})
    public Object findAllUser(@PathVariable("pageNum") int pageNum, @PathVariable("pageSize") int pageSize){

        return projectService.findAllProject(pageNum,pageSize);
    }

    @RequestMapping(value = "/insert")
    @ResponseBody
    public String insertProject(){
        Project project =  new Project();
        project.setId(5);
        project.setName("李宇春");
        projectService.insertProject(project);
        return "hello";
    }
}
