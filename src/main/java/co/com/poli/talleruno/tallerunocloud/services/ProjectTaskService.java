package co.com.poli.talleruno.tallerunocloud.services;
import co.com.poli.talleruno.tallerunocloud.entities.ProjectTask;

import java.util.List;

public interface ProjectTaskService {

    ProjectTask save(ProjectTask projectTask);
    ProjectTask delete(Long id);
    List<ProjectTask> findAll();
}
