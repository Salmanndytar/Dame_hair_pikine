package com.Dame_hair_pikine.Dame_hair_pikine.dto;

import com.Dame_hair_pikine.Dame_hair_pikine.model.Category;
import com.Dame_hair_pikine.Dame_hair_pikine.model.Produit;
import lombok.Builder;
import lombok.Data;


import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

@Data
@Builder
public class CategoryDto {
    private Integer id;

    private String name;
    private Instant date;
    private List<Produit> listeproduit= new ArrayList<>();

  static public CategoryDto fromEntity(Category category){
      return   CategoryDto.builder()
                .id(category.getId())
                .date(category.getDate())
                .listeproduit(category.getListeproduit())
                .name(category.getName())
                .build();

    }
    static public Category toEntity(CategoryDto categoryDto){
        return Category.builder()
                .id(categoryDto.getId())
                .date(categoryDto.getDate())
                .listeproduit(categoryDto.getListeproduit())
                .name(categoryDto.getName())

                .build();
    }
}
