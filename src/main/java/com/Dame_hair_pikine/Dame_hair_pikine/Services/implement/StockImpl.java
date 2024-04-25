package com.Dame_hair_pikine.Dame_hair_pikine.Services.implement;

import com.Dame_hair_pikine.Dame_hair_pikine.Services.interfaces.IStock;
import com.Dame_hair_pikine.Dame_hair_pikine.dto.StockDto;

import java.util.List;

public class StockImpl implements IStock {
    @Override
    public StockDto saveStock(StockDto stockDto) {
        return null;
    }

    @Override
    public StockDto editStock(StockDto stockDto) {
        return null;
    }

    @Override
    public void deleteStoc(Integer id) {

    }

    @Override
    public List<StockDto> listStockProd(String ProdName, float minPriU, float maxPriU, float minPriV, float maxPriV, String category, Boolean etat) {
        return null;
    }
}
