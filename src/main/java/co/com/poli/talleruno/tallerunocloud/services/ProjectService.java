package co.com.poli.talleruno.tallerunocloud.services;
import co.com.poli.talleruno.tallerunocloud.entities.Project;

import java.util.List;

public interface ProjectService {

    List<Project> findAll();
    Project save(Project project);

}
