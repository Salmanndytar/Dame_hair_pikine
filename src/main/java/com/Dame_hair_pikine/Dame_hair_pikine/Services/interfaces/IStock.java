package com.Dame_hair_pikine.Dame_hair_pikine.Services.interfaces;

import com.Dame_hair_pikine.Dame_hair_pikine.dto.StockDto;

import java.util.List;

public interface IStock {
    StockDto saveStock(StockDto stockDto);
    StockDto editStock(StockDto stockDto);
    void deleteStoc(Integer id);
    List<StockDto> listStockProd(String ProdName,float minPriU, float maxPriU, float minPriV, float maxPriV, String category, Boolean etat);


}
