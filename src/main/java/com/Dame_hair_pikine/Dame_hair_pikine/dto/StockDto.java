package com.Dame_hair_pikine.Dame_hair_pikine.dto;
import com.Dame_hair_pikine.Dame_hair_pikine.model.Produit;
import com.Dame_hair_pikine.Dame_hair_pikine.model.Stock;
import com.Dame_hair_pikine.Dame_hair_pikine.model.Utilisateur;

import lombok.Builder;
import lombok.Data;

import java.time.Instant;


@Data
@Builder
public class StockDto {
    private Integer id;

    private Produit produit;
    private Utilisateur user;
    private Integer quantitestock;
    private Float prixunit;
    private Float prixvente;
    private Instant datemodify;

    public  static StockDto fromEntity(Stock stock){
        return StockDto.builder()
                .id(stock.getId())
                .produit(stock.getProduit())
                .quantitestock(stock.getQuantitestock())
                .prixunit(stock.getPrixunit())
                .prixvente(stock.getPrixvente())
                .datemodify(stock.getDatemodify())
                .user(stock.getUser())
                .build();}
    public static Stock toEntity(StockDto stockDto){
        return    Stock.builder()
                .id(stockDto.getId())
                .produit(stockDto.getProduit())
                .quantitestock(stockDto.getQuantitestock())
                .prixunit(stockDto.getPrixunit())
                .prixvente(stockDto.getPrixvente())
                .datemodify(stockDto.getDatemodify())
                .user(stockDto.getUser())
                .build();}
}
