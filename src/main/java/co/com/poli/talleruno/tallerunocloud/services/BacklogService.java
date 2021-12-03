package co.com.poli.talleruno.tallerunocloud.services;


import co.com.poli.talleruno.tallerunocloud.entities.Backlog;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BacklogService {

    List<Backlog> findAllBacklog();
    Backlog save(Backlog backlog);



}
