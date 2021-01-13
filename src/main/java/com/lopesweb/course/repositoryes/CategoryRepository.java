package com.lopesweb.course.repositoryes;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lopesweb.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
