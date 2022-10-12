package tn.spring.springboot1;

import tn.spring.springboot1.entity.Universite;
import tn.spring.springboot1.entity.contrat;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name = ("Departement"))
public class Departement implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = ("idDepart"))
    private Integer idDepart;
    private String nomDepart;

    @OneToMany(cascade = CascadeType.ALL, mappedBy="depart")
    private Set<tn.spring.springboot1.entity.Etudiant> Etudiants;


}
