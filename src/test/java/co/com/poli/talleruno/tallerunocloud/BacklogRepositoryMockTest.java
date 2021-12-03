package co.com.poli.talleruno.tallerunocloud;

import co.com.poli.talleruno.tallerunocloud.entities.Backlog;
import co.com.poli.talleruno.tallerunocloud.entities.Project;
import co.com.poli.talleruno.tallerunocloud.repositories.BacklogRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.stereotype.Repository;

import java.util.List;

@DataJpaTest
public class BacklogRepositoryMockTest {

    @Autowired
    private BacklogRepository backlogRepository;



}
