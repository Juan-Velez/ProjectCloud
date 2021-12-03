package co.com.poli.talleruno.tallerunocloud.repositories;

import co.com.poli.talleruno.tallerunocloud.entities.ProjectTask;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProjectTaskRepository extends JpaRepository<ProjectTask,Long> {

    ProjectTask save(ProjectTask projectTask);
    ProjectTask delete(Long id);
    List<ProjectTask> findAll();
}
