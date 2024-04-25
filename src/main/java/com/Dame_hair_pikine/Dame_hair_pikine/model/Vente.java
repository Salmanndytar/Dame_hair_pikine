package com.Dame_hair_pikine.Dame_hair_pikine.model;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;
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
public class Vente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @CreatedDate
    @Column(nullable=false,updatable=false)
    private Instant dateCreer;
    @LastModifiedDate
    @Column
    private Instant dateModifier;
    @Column
    private Instant dateVente;

    @OneToMany(mappedBy = "vente",fetch=FetchType.LAZY)
    private List<DetailVent> listedeDetail= new ArrayList<>();

    @ManyToOne
    @JoinColumn(name="id_user")
    private Utilisateur user;

}
