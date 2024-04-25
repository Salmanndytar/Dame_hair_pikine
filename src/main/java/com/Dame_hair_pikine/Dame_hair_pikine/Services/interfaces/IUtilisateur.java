package com.Dame_hair_pikine.Dame_hair_pikine.Services.interfaces;

import com.Dame_hair_pikine.Dame_hair_pikine.dto.UtilisateurDto;

import java.util.List;

public interface IUtilisateur {
    UtilisateurDto findUtilisateurByMail(String mail);
    UtilisateurDto sav(UtilisateurDto utulisateurDto);

    List<UtilisateurDto> searchUserByname(String kyword);
    Boolean checkMail(String mail);
    UtilisateurDto findUtilisateurById(Integer id);

    void deleteUser(Integer id);
}
