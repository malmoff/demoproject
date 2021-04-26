package com.example.demoproject.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demoproject.Entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
