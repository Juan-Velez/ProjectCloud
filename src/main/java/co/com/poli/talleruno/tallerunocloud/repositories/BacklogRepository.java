package co.com.poli.talleruno.tallerunocloud.repositories;
import co.com.poli.talleruno.tallerunocloud.entities.Backlog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface BacklogRepository  extends JpaRepository<Backlog,Long> {

    List<Backlog> findAllById(Backlog backlog);
}
