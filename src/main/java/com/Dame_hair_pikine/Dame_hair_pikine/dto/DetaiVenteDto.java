package com.Dame_hair_pikine.Dame_hair_pikine.dto;

import com.Dame_hair_pikine.Dame_hair_pikine.model.DetailVent;
import com.Dame_hair_pikine.Dame_hair_pikine.model.Produit;
import com.Dame_hair_pikine.Dame_hair_pikine.model.Stock;
import com.Dame_hair_pikine.Dame_hair_pikine.model.Vente;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class DetaiVenteDto {
    private Integer id;
    private Vente vente;
    private Stock stock;
    private Integer quantite;
    public  static DetaiVenteDto fromEntity(DetailVent vente){
        return DetaiVenteDto.builder()
                .id(vente.getId())
                .vente(vente.getVente())
                .stock(vente.getStock())
                .quantite(vente.getQuantite())
                .build();}
    public static DetailVent toEntity(DetaiVenteDto venteDto){
        return DetailVent.builder()
                .id(venteDto.getId())
                .vente(venteDto.getVente())
                .stock(venteDto.getStock())
                .quantite(venteDto.getQuantite())
                .build();}
}
