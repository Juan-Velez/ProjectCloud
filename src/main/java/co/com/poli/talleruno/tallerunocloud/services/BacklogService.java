package co.com.poli.talleruno.tallerunocloud.services;


import co.com.poli.talleruno.tallerunocloud.entities.Backlog;

import java.util.List;

public interface BacklogService {


    List<Backlog> findAllBacklog();
    Backlog addBacklog(Backlog backlog);
    Backlog findByIdBacklog (Long id);


}
