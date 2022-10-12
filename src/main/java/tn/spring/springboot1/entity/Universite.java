package tn.spring.springboot1.entity;

import tn.spring.springboot1.Departement;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
public class Universite implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = ("idUniv"))
    private Integer idUniv;
    private String nomUniv;

    @OneToMany(cascade = CascadeType.ALL)
    private Set<Departement> depart;

}
