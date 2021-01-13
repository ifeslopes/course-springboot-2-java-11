package com.lopesweb.course.repositoryes;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lopesweb.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
