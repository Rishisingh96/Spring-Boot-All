package com.rishi.orm.repositories;

import com.rishi.orm.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer>
{

}
