package tn.spring.springboot1.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
public class contrat implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = ("idContrat"))
    private Integer idContrat;
    private Date dateDebutContrat;
    private Date dateFinContrat;
    private Boolean archive;
    private Integer montantContrat;
    @Enumerated(EnumType.STRING)
    private Specialite specialite;
    @ManyToOne
   Etudiant etud;



}
