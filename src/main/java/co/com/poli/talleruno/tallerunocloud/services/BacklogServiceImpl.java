package co.com.poli.talleruno.tallerunocloud.services;

import co.com.poli.talleruno.tallerunocloud.entities.Backlog;
import co.com.poli.talleruno.tallerunocloud.repositories.BacklogRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BacklogServiceImpl implements BacklogService {

    private final BacklogRepository backlogRepository;

    @Override
    public List<Backlog> findAllBacklog() {
        return backlogRepository.findAllBacklog();
        }

    @Override
    public Backlog addBacklog(Backlog backlog) {
        return null;
    }

    @Override
    public Backlog findByIdBacklog(Long id) {
        return  backlogRepository.findById(id).orElse(null);
    }
}
