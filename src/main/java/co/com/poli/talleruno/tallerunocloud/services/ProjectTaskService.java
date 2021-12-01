package co.com.poli.talleruno.tallerunocloud.services;
import co.com.poli.talleruno.tallerunocloud.entities.ProjectTask;

import java.util.List;

public interface ProjectTaskService {

    void save(ProjectTask projectTask);
    void delete(ProjectTask projectTask);
    List<ProjectTask> findAll();
}
