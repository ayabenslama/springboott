package tn.spring.springboot1.entity;

import tn.spring.springboot1.Departement;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table( name = "Etudiant")
public class Etudiant implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="idEtudiant")
    private long idEtudiant;
    private String nomE;
    private String prenomE;
    @Enumerated(EnumType.STRING)
    private option op;
    @OneToMany(cascade = CascadeType.ALL, mappedBy="etud")
    private Set<contrat> contrats;

    @ManyToOne
    Departement depart;

    @ManyToMany(cascade = CascadeType.ALL)
    private Set<Equipe> equipes;

}
