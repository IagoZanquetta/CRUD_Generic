package com.example.demo.resources;

import com.example.demo.entities.Product;
import com.example.demo.entities.dto.ProductDto;
import com.example.demo.repositories.ProductRepository;
import org.springframework.data.domain.*;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("RestApi/")
public class ProductResources {

    private final ProductRepository repository;

    public ProductResources(ProductRepository repository){
        this.repository = repository;
    }

    @GetMapping(path = "productsDefault/")//OKAY
    public Page<Product> findAllDefault(
            @RequestParam(
                    value = "page",
                    required = false,
                    defaultValue = "0") int page,
            @RequestParam(
                    value = "size",
                    required = false,
                    defaultValue = "10") int size)
    {
        var products = repository.findAll();
        return new PageImpl<Product>(products, PageRequest.of(
                page,
                size,
                Sort.Direction.ASC,
                "name"), products.size());
    }

    @GetMapping(path = "products/")//OKAY
    public Page<ProductDto> findAll(
            @RequestParam(
                    value = "page",
                    required = false,
                    defaultValue = "0") int page,
            @RequestParam(
                    value = "size",
                    required = false,
                    defaultValue = "10") int size)
    {
        var products = repository.findAll().stream()
                .map(ProductDto::converterModelDto)
                .collect(Collectors.toList());
        return new PageImpl<ProductDto>(products, PageRequest.of(
                page,
                size,
                Sort.Direction.ASC,
                "name"), products.size());
    }

    @GetMapping(path = "productId/{id}")//OKAY
    public ProductDto findById(@PathVariable Long id) {
        var productOptional = repository.findById(id);
        if (productOptional.get() != null) {
            return ProductDto.converterModelDto(productOptional.get());
        }
        return null;
    }

    @GetMapping(path = "productName/{name}")
    public Page<ProductDto> findByName(//OKAY
            @PathVariable String name,
            @RequestParam(
            value = "page",
            required = false,
            defaultValue = "0") int page,
            @RequestParam(
                    value = "size",
                    required = false,
                    defaultValue = "10") int size) {
        var productPage = repository.findByName(name, PageRequest.of(
                page,
                size,
                Sort.Direction.ASC,
                "name")
        ).stream()
                .map(ProductDto::converterModelDto)
                .collect(Collectors.toList());
        if (productPage != null) {
            return new PageImpl<ProductDto>(productPage, PageRequest.of(
                    page,
                    size,
                    Sort.Direction.ASC,
                    "name"), productPage.size());
        }
        return null;
    }

    @PostMapping(path = "product/save")//OKAY
    public void create(@RequestBody Product product) {
        var productSave = new Product();
        productSave.setName(product.getName());
        productSave.setPrice(product.getPrice());
        productSave.setCreation_date(new Date());
        repository.save(productSave);
    }

    @PutMapping(path = "product/edit/{id}")//OKAY
    public void edit(@PathVariable Long id, @RequestBody Product product) {
        var productOptional = repository.findById(id);
        if(productOptional.get() != null){
            var productData = productOptional.get();
            productData.setName(product.getName());
            productData.setPrice(product.getPrice());
            productData.setEdition_date(new Date());
            repository.save(productData);
        }
    }

    @PatchMapping(path = "product/editName/{id}/{name}")//OKAY
    public void editName(@PathVariable Long id, @PathVariable String name) {
        var productOptional = repository.findById(id);
        if(productOptional.get() != null){
            var productData = productOptional.get();
            productData.setName(name);
            productData.setEdition_date(new Date());
            repository.save(productData);
        }
    }

    @DeleteMapping(path = "product/delete/{id}")//OKAY
    public void delete(@PathVariable Long id){
        var productOptional = repository.findById(id);
        if(productOptional.get() != null){
            if(productOptional.get().getPrice()!=10){
                repository.deleteById(id);
            }
        }
    }
}
