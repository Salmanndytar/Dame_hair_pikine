package com.Dame_hair_pikine.Dame_hair_pikine.model;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table
public class Stock{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name="id_produit")
    private Produit produit;

    @OneToMany(mappedBy = "vente",fetch=FetchType.EAGER)
    private List<DetailVent> listedetailVente= new ArrayList<>();

    @ManyToOne
    @JoinColumn(name="id_user")
    private Utilisateur user;
    @Column
    private Integer quantitestock;
    @Column
    private Float prixunit;
    @Column
    private Float prixvente;
    @Column
    @LastModifiedDate
    private Instant datemodify;

}
