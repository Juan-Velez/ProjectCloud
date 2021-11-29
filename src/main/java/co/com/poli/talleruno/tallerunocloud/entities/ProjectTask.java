package co.com.poli.talleruno.tallerunocloud.entities;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import java.util.Date;

public class ProjectTask {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @NotEmpty(message = "El name no puede ser vacio")
    @Column(name = "name")
    private String name;
    @NotEmpty(message = "El summary no puede ser vacio")
    @Column(name = "summary")
    private String summary;
    @NotEmpty(message = "El acceptanceCriteria no puede ser vacio")
    @Column(name = "acceptanceCriteria")
    private String description;
    @NotEmpty(message = "El status no puede ser vacio")
    @Column(name = "status")
    private Date status;
    @NotEmpty(message = "Un rango de 1 - 5 ")
    @Column(name = "priority")
    private int priority;
    @NotEmpty(message = "Un rango de 1 - 8 ")
    @Column(name = "hours")
    private double hours;
    @Column(name = "starDate")
    private Date starDate;
    @Column(name = "endDate")
    private Date endDate;
    @NotEmpty(message = "No se puede actualizar")
    @Column(name = "projectIdentifier")
    private String projectIdentifier;
}
