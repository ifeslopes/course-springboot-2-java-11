package com.lopesweb.course.repositoryes;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lopesweb.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
