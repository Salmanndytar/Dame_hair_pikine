package com.Dame_hair_pikine.Dame_hair_pikine.dto;

import com.Dame_hair_pikine.Dame_hair_pikine.model.Category;
import com.Dame_hair_pikine.Dame_hair_pikine.model.Produit;
import com.Dame_hair_pikine.Dame_hair_pikine.model.Role;
import com.Dame_hair_pikine.Dame_hair_pikine.model.Utilisateur;
import lombok.Builder;
import lombok.Data;


import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
@Data
@Builder
public class RoleDto {
    private Integer id;

    private String namerole;
    private Instant date;
    private List<Utilisateur> listeuser= new ArrayList<>();

    static public RoleDto fromEntity(Role role){
        return   RoleDto.builder()
                .id(role.getId())
                .namerole(role.getNamerole())
                .build();

    }
    static public Role toEntity(RoleDto roleDto){
        return Role.builder()
                .id(roleDto.getId())
                .namerole(roleDto.getNamerole())
                .build();
    }
}
