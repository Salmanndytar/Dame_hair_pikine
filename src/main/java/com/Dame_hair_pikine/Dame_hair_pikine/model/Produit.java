package com.Dame_hair_pikine.Dame_hair_pikine.model;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.LastModifiedDate;

import java.awt.*;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table
@Builder
public class Produit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 20)
    private String name;

    @Column(length = 500)
    private String description;


    @Column
    @LastModifiedDate
    private Instant date;
    @ManyToOne
    @JoinColumn(name="IdCategory")
    private Category categori;

    @Column()
    private Boolean etat;

    @OneToMany(mappedBy = "produit",fetch=FetchType.LAZY)
    private List<DetailVent> listedeDetail= new ArrayList<>();


}
