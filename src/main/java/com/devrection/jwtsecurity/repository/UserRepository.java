package com.devrection.jwtsecurity.repository;

import com.devrection.jwtsecurity.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Integer> {
}