package com.Dame_hair_pikine.Dame_hair_pikine.model;

import jakarta.persistence.*;
import lombok.*;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table
public class DetailVent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ManyToOne
    @JoinColumn(name="id_vente ")
    private Vente vente;

    @ManyToOne
    @JoinColumn(name="id_produit")
    private Produit produit;
     @Column
    private Integer quantite;

}
