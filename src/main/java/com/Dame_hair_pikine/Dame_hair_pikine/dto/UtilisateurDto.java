package com.Dame_hair_pikine.Dame_hair_pikine.dto;
import com.Dame_hair_pikine.Dame_hair_pikine.model.*;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Data
@Builder
public class UtilisateurDto {
    private Integer id;
    private String name;
    private String prenom;//Ob
    private String password;//generer auto

    private String mail;//Ob
    private String tel;
    private Boolean etat;

    private Collection<Role> roles= new ArrayList<>();
    private List<DetailVent> listedeDetail= new ArrayList<>();
    private List<Stock> listStock= new ArrayList<>();

    public  static UtilisateurDto fromEntity(Utilisateur user){
        return UtilisateurDto.builder()
                .id(user.getId())
                .name(user.getName())
                .prenom(user.getPrenom())
                .etat(user.getEtat())
                .password(user.getPassword())
                .mail(user.getMail())
                .tel(user.getTel())
                .build();}
    public static Utilisateur toEntity(UtilisateurDto userDto){
        return    Utilisateur.builder()
                .id(userDto.getId())
                .name(userDto.getName())
                .name(userDto.getPrenom())
                .password(userDto.getPassword())
                .mail(userDto.getMail())
                .tel(userDto.getTel())
                .etat(userDto.getEtat())
                .roles(userDto.getRoles())
                .build();}
}
