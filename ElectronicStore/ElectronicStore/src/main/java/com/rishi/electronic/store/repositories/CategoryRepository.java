package com.rishi.electronic.store.repositories;

import com.rishi.electronic.store.entites.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, String>
{
}
