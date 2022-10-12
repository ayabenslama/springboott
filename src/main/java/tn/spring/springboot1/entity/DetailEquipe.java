package tn.spring.springboot1.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class DetailEquipe implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = ("idDetailEquipe"))
    private Integer idDetailEquipe;
    private  Integer salle;
    private String thematique;

    @OneToOne(mappedBy="detailEquipe")
    private Equipe equip1;
}
