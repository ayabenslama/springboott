package tn.spring.springboot1.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
public class Equipe implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = ("idEquipe"))
    private Integer idEquipe;
    private String nomEquipe;
    @Enumerated(EnumType.STRING)
    private Niveau niveau;
    @ManyToMany(mappedBy="equipes", cascade = CascadeType.ALL)

    private Set<Etudiant> etudiants;
    @OneToOne
    private DetailEquipe detailEquipe;


}
