package com.example.demo.dao;

import com.example.demo.model.Project;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ProjectDao {
    @Select("select * from project")
    List<Project> findAllProject();

    @Insert("insert into project(id, name) values(#{id}, #{name})")
    void insertProject(Project project);
}
