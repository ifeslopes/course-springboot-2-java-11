package com.lopesweb.course.repositoryes;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lopesweb.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
