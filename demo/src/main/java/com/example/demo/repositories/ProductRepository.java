package com.example.demo.repositories;

import com.example.demo.entities.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {

    @Query("select p from Product p where p.name like %:name%")
    Page<Product> findByName(String name, Pageable pageable);
}
