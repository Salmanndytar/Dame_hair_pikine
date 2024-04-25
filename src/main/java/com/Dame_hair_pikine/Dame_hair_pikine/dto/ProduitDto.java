package com.Dame_hair_pikine.Dame_hair_pikine.dto;

import com.Dame_hair_pikine.Dame_hair_pikine.model.Category;
import com.Dame_hair_pikine.Dame_hair_pikine.model.DetailVent;
import com.Dame_hair_pikine.Dame_hair_pikine.model.Produit;
import lombok.Builder;
import lombok.Data;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

@Data
@Builder
public class ProduitDto {

    private Integer id;

    private String name;

    private String description;

    private Instant date;

    private Category categori;

    private Boolean etat;
    private List<DetailVent> listedeDetail= new ArrayList<>();

   public  static ProduitDto fromEntity(Produit prod){
       return ProduitDto.builder()
               .id(prod.getId())
               .name(prod.getName())
               .description(prod.getDescription())
               .date(prod.getDate())
               .categori(prod.getCategori())
               .etat(prod.getEtat()).build();}
    public static Produit toEntity(ProduitDto prodDto){
       return    Produit.builder()
               .id(prodDto.getId())
               .name(prodDto.getName())
               .description(prodDto.getDescription())
               .date(prodDto.getDate())
               .categori(prodDto.getCategori())
               .etat(prodDto.getEtat()).build();}

}
