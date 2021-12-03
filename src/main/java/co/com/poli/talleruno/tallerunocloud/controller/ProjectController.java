package co.com.poli.talleruno.tallerunocloud.controller;

import co.com.poli.talleruno.tallerunocloud.entities.Backlog;
import co.com.poli.talleruno.tallerunocloud.entities.Project;
import co.com.poli.talleruno.tallerunocloud.repositories.ProjectRepository;
import co.com.poli.talleruno.tallerunocloud.services.BacklogService;
import co.com.poli.talleruno.tallerunocloud.services.ProjectService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/project")
//@RequiredArgsConstructor
public class ProjectController {

    @Autowired
    ProjectService projectService;
    //private final ProjectService projectService;

    @GetMapping
    List<Project> findAll(){
        return projectService.findAll();
    }

    @PostMapping
    Project save(Project project){
        return  projectService.save(project);
    }

}
