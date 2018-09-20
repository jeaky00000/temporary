package com.example.demo.services;

import com.example.demo.model.Project;

import java.util.List;

public interface ProjectService {
    List<Project> findAllProject(int pageNo, int pageSize);
    void insertProject(Project project);
}
