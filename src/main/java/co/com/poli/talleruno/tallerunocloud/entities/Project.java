package co.com.poli.talleruno.tallerunocloud.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.Date;
import java.util.Objects;

@Getter
@Setter
@Entity
@Table(name = "projects")
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @NotEmpty(message = "El projectName no puede ser vacio")
    @Column(name = "projectName")
    private String projectName;
    @NotEmpty(message = "El projectIdentifier no puede ser vacio")
    @Column(name = "projectIdentifier")
    private String projectIdentifier;
    @NotEmpty(message = "El description no puede ser vacio")
    @Column(name = "description")
    private String description;
    @NotEmpty(message = "El date no puede ser vacio")
    @Column(name = "startDate")
    private Date startDate;
    @NotEmpty(message = "El endDate no puede ser vacio")
    @Column(name = "endDate")
    private Date endDate;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "project_id")
    @JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
    private Backlog backlog;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Project project = (Project) o;
        return Objects.equals(id, project.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
