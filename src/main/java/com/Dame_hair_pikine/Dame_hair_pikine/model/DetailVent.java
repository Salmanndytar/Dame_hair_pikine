package com.Dame_hair_pikine.Dame_hair_pikine.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
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

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name="id_stock" )
    private Stock stock;
     @Column
    private Integer quantite;

}
