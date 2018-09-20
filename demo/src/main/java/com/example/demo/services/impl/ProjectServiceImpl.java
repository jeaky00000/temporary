package com.example.demo.services.impl;

import com.example.demo.dao.ProjectDao;
import com.example.demo.model.Project;
import com.example.demo.services.ProjectService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "projectService")
public class ProjectServiceImpl implements ProjectService {
    @Autowired
    ProjectDao projectDao;


    @Override
    public List<Project> findAllProject(int pageNo, int pageSize) {
        PageHelper.startPage(pageNo, pageSize);
        return projectDao.findAllProject();
    }

    @Override
    public void insertProject(Project project) {
        projectDao.insertProject(project);
    }
}
