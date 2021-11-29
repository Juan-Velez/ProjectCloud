package co.com.poli.talleruno.tallerunocloud.services;


import co.com.poli.talleruno.tallerunocloud.entities.Backlog;

import java.util.List;

public interface BacklogService {
    void save(Backlog backlog);
    List<Backlog> findAll();
    Backlog findById(Long id);



}
