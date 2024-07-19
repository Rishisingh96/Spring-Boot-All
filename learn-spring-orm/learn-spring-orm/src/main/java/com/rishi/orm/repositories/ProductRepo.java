package com.rishi.orm.repositories;

import com.rishi.orm.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.domain.Pageable; // Correct import for Pageable

import java.util.List;
import java.util.Optional;

public interface ProductRepo extends JpaRepository<Product, String> {

    // 1. Custom (Finder) Methods
    Optional<Product> findByProductName(String productName);

    Product findBypId(String pid); // Changed parameter type to String

    Product findByProductNameIsNot(String productName);

    List<Product> findByProductNameIsNull();

    List<Product> findByActiveTrue(Pageable pageable);

    List<Product> findByActiveFalse();

    List<Product> findByProductNameLike(String pattern);

    List<Product> findByPriceLessThan(double price);

    List<Product> findByPriceLessThanEqual(double price);

    List<Product> findByPriceGreaterThan(double price);

    List<Product> findByProductNameAndPrice(String name, double price);

    List<Product> findByProductNameOrPrice(String name, double price);

    Product findByProductNameOrderByProductNameAsc(String productName);

    // 2. Custom Query Methods   //JPQL :JPQL stands for Java Persistence Query Language. It is a query language used in JPA (Java Persistence API) to interact with relational databases in an object-oriented manner. JPQL is similar to SQL but operates on the entity objects defined in a JPA context rather than directly on database tables. This allows for more intuitive and object-oriented database queries within Java applications.
    @Query("SELECT p FROM Product p")
    List<Product> getAllProductWhileLearningJPA();

    @Query("SELECT p FROM Product p WHERE p.productName = 'Iphone 14 max'")
    List<Product> getAllActiveProducts();

    @Query("SELECT p FROM Product p WHERE p.pId = ?1 AND p.productName = ?2")
    Product getSingleProductByIdAndName1(String pId, String productName); // Changed parameter type to String

    @Query("SELECT p FROM Product p WHERE p.pId = :productId AND p.productName = :productName")
    Product getSingleProductByIdAndName2(@Param("productId") String productId, @Param("productName") String productName); // Changed parameter type to String

    // Native queries
    @Query(value = "SELECT * FROM jpa_product WHERE product_name = :productName", nativeQuery = true)
    Product getProductByIdAndNameNative(@Param("productName") String productName);

    List<Product> findByProductNameEndingWith(String suffix);

    List<Product> findByProductNameContaining(String keyword);

    List<Product> findByProductNameIn(List<String> names);
}
