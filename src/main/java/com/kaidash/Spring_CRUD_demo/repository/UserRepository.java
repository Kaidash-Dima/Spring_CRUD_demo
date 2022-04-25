package com.kaidash.Spring_CRUD_demo.repository;

import com.kaidash.Spring_CRUD_demo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
