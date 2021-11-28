package co.com.poli.talleruno.tallerunocloud.entities;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import javax.persistence.*;
import java.util.Objects;

@Getter
@Setter
@Entity
@Table(name = "backlog")
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Backlog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false,unique = true,nullable = false)
    private Long id;
    private String projectIdentifier;

    /*@OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "project_id")
    @JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
    private Project project; */



}
