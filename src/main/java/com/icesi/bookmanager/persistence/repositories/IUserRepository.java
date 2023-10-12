package com.icesi.bookmanager.persistence.repositories;

import com.icesi.bookmanager.persistence.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IUserRepository extends JpaRepository<User,Integer> {
    Optional<User> findByEmail(String email);
}
