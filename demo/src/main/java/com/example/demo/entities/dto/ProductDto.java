package com.example.demo.entities.dto;

import com.example.demo.entities.Product;

public class ProductDto {
    private Long id;
    private String name;

    public ProductDto() {
    }
    public ProductDto(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public static ProductDto converterModelDto(Product product){
        ProductDto productDto = new ProductDto();
        productDto.setId(product.getId());
        productDto.setName(product.getName());
        return productDto;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
