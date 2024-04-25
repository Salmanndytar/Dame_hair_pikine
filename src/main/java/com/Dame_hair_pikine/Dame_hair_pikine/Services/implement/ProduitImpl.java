package com.Dame_hair_pikine.Dame_hair_pikine.Services.implement;

import com.Dame_hair_pikine.Dame_hair_pikine.Services.interfaces.IProduit;
import com.Dame_hair_pikine.Dame_hair_pikine.dto.CategoryDto;
import com.Dame_hair_pikine.Dame_hair_pikine.dto.ProduitDto;
import com.Dame_hair_pikine.Dame_hair_pikine.model.Produit;

import java.util.List;

public class ProduitImpl implements IProduit {
    @Override
    public Produit addProd(ProduitDto produitDto) {
        return null;
    }

    @Override
    public Produit editProd(ProduitDto produitDto) {
        return null;
    }

    @Override
    public Produit finById(Integer id) {
        return null;
    }

    @Override
    public List<ProduitDto> findAllbyCategorie(CategoryDto categorieDto) {
        return null;
    }

    @Override
    public List<ProduitDto> finAll() {
        return null;
    }

    @Override
    public void deleteProd(Integer id) {

    }

    @Override
    public ProduitDto updateEtatProduit(Integer idProd, Boolean etatProd) {
        return null;
    }

    @Override
    public List<ProduitDto> findAllByEtatProd(boolean etatProd) {
        return null;
    }

    @Override
    public List<ProduitDto> searchAliment(String nom, String category, Boolean etat) {
        return null;
    }
}
