package co.com.poli.talleruno.tallerunocloud.controller;

import co.com.poli.talleruno.tallerunocloud.entities.Backlog;
import co.com.poli.talleruno.tallerunocloud.entities.ProjectTask;
import co.com.poli.talleruno.tallerunocloud.services.BacklogService;
import co.com.poli.talleruno.tallerunocloud.services.ProjectTaskService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/projectTask")
//@RequiredArgsConstructor
public class ProjectTaskController {

    @Autowired ProjectTaskService projectTaskService;
    //private final ProjectTaskService projectTaskService;

    @GetMapping
    List<ProjectTask> findAll(){
        return projectTaskService.findAll();
    }

    @PostMapping
    ProjectTask save(ProjectTask projectTask){
        return  projectTaskService.save(projectTask);
    }

     @DeleteMapping("/{id}")
    ProjectTask  delete(@PathVariable Long id){
        return projectTaskService.delete(id);
    }


}
