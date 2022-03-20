package com.example.sprintboottestcontainers.repositories;

import com.example.sprintboottestcontainers.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
}
