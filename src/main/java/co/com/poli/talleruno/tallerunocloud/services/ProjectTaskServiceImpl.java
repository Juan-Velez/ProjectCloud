package co.com.poli.talleruno.tallerunocloud.services;

import co.com.poli.talleruno.tallerunocloud.entities.ProjectTask;
import co.com.poli.talleruno.tallerunocloud.repositories.ProjectTaskRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProjectTaskServiceImpl implements ProjectTaskService {

    private final ProjectTaskRepository projectTaskRepository;

    @Override
    public void save(ProjectTask projectTask) {
        projectTaskRepository.save(projectTask);
    }

    @Override
    public void delete(ProjectTask projectTask) {
        projectTaskRepository.delete(projectTask);
    }

    @Override
    public List<ProjectTask> findAll() {
        return null;
    }
}
