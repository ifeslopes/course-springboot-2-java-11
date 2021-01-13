package com.lopesweb.course.repositoryes;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lopesweb.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
