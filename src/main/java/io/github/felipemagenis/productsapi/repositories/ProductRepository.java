package io.github.felipemagenis.productsapi.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import io.github.felipemagenis.productsapi.models.ProductModel;

public interface ProductRepository extends JpaRepository<ProductModel,UUID>{
}
