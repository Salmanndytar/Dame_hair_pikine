package com.Dame_hair_pikine.Dame_hair_pikine.Services.interfaces;

import com.Dame_hair_pikine.Dame_hair_pikine.dto.CategoryDto;
import com.Dame_hair_pikine.Dame_hair_pikine.dto.ProduitDto;
import com.Dame_hair_pikine.Dame_hair_pikine.model.Produit;

import java.util.List;

public interface IProduit {
    Produit addProd(ProduitDto produitDto);
    Produit editProd(ProduitDto produitDto);
    Produit finById(Integer id);
    List<ProduitDto> findAllbyCategorie(CategoryDto categorieDto);
    List<ProduitDto> finAll();
    void deleteProd(Integer id);
    ProduitDto updateEtatProduit(Integer idProd, Boolean etatProd);
    List<ProduitDto> findAllByEtatProd(boolean etatProd);
    List<ProduitDto> searchAliment(String nom,  String category, Boolean etat);
}
