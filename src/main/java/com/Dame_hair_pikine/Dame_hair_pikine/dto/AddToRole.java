package com.Dame_hair_pikine.Dame_hair_pikine.dto;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class AddToRole {
    private Integer id;
    private  String rolename;
    private String usermail;
}
