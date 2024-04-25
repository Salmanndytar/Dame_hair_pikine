package com.Dame_hair_pikine.Dame_hair_pikine.dto;

import com.Dame_hair_pikine.Dame_hair_pikine.model.DetailVent;
import com.Dame_hair_pikine.Dame_hair_pikine.model.Utilisateur;

import com.Dame_hair_pikine.Dame_hair_pikine.model.Vente;
import lombok.Builder;
import lombok.Data;


import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

@Builder
@Data
public class VenteDto {
    private Integer id;
    private Instant dateCreer;
    private Instant dateModifier;
    private Instant dateVente;
    private List<DetailVent> listedeDetail;
    private Utilisateur user;

    public  static VenteDto fromEntity(Vente vente){
        return VenteDto.builder()
                .id(vente.getId())
                .dateCreer(vente.getDateCreer())
                .dateModifier(vente.getDateModifier())
                .dateVente(vente.getDateVente())
                .listedeDetail(vente.getListedeDetail())
                .user(vente.getUser())
                .build();}
    public static Vente toEntity(VenteDto venteDto){
        return    Vente.builder()
                .id(venteDto.getId())
                .dateCreer(venteDto.getDateCreer())
                .dateModifier(venteDto.getDateModifier())
                .dateVente(venteDto.getDateVente())
                .listedeDetail(venteDto.getListedeDetail())
                .user(venteDto.getUser())
                .build();}
}
