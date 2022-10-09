package com.rogih.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rogih.demo.entities.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long>{

}
