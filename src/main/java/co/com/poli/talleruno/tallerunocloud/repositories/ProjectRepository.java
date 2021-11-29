package co.com.poli.talleruno.tallerunocloud.repositories;

import co.com.poli.talleruno.tallerunocloud.entities.Project;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProjectRepository  extends JpaRepository<Project,Long> {

    List<Project> findByProject(Project project);
    List<Project> findAllProject();
    Project addProject(Project project);
    Project updateProject(Project project);
    Project deleteProject(Long id);
    Project findByIdProject(Long id);

}
