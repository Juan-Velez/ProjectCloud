package co.com.poli.talleruno.tallerunocloud.services;
import co.com.poli.talleruno.tallerunocloud.entities.Project;

import java.util.List;

public interface ProjectService {

    void save(Project project);
    List<Project> findAll();
}
