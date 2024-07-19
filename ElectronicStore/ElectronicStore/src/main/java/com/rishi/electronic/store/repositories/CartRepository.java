package com.rishi.electronic.store.repositories;

import com.rishi.electronic.store.entites.Cart;
import com.rishi.electronic.store.entites.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CartRepository extends JpaRepository<Cart, String> {

    Optional<Cart> findByUser(User user);
}
