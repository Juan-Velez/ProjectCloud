package co.com.poli.talleruno.tallerunocloud.services;

import co.com.poli.talleruno.tallerunocloud.entities.Backlog;
import co.com.poli.talleruno.tallerunocloud.repositories.BacklogRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
//@RequiredArgsConstructor
public class BacklogServiceImpl implements BacklogService {

    @Autowired
    private  BacklogRepository backlogRepository;
    //private final BacklogRepository backlogRepository;

    @Override
    public List<Backlog> findAllBacklog() {
        return backlogRepository.findAllBacklog();
        }

    @Override
    public Backlog save(Backlog backlog) {
        return backlogRepository.save(backlog);
    }

}
