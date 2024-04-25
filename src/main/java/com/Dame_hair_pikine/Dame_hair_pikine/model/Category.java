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
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 20)
    private String name;
    @Column
    @LastModifiedDate
    private Instant date;
    @OneToMany(mappedBy = "categori",fetch=FetchType.LAZY)
    private List<Produit> listeproduit= new ArrayList<>();


}
