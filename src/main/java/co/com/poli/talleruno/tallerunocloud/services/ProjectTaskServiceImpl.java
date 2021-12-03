package co.com.poli.talleruno.tallerunocloud.services;

import co.com.poli.talleruno.tallerunocloud.entities.ProjectTask;
import co.com.poli.talleruno.tallerunocloud.repositories.ProjectTaskRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectTaskServiceImpl implements ProjectTaskService {


    @Autowired
    private ProjectTaskRepository projectTaskRepository;


    @Override
    public ProjectTask save(ProjectTask projectTask) {
        return projectTaskRepository.save(projectTask);
    }

    @Override
    public ProjectTask delete(Long id) {
        return projectTaskRepository.delete(id);
    }

    @Override
    public List<ProjectTask> findAll() {
        return null;
    }
}
