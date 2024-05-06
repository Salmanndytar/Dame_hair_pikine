package com.Dame_hair_pikine.Dame_hair_pikine.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table
public class Utilisateur {
    @Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Integer id;
    @Column(length = 20)
    private String name;

    @Column(length = 20)
    private String tel;

    @Column(length = 64)
    private String password;

    @Column(length = 40)
    private String prenom;

    @Column(length = 30)
    private String mail;

    @Column()
    private Boolean etat;
    @ManyToMany(fetch=FetchType.EAGER)
    private Collection<Role> roles= new ArrayList<>();


    @OneToMany(mappedBy = "demande",fetch=FetchType.LAZY)
    private List<DetailVent> listedeDetail= new ArrayList<>();

    @OneToMany(mappedBy = "user",fetch=FetchType.LAZY)
    private List<Stock> listStock= new ArrayList<>();

}
