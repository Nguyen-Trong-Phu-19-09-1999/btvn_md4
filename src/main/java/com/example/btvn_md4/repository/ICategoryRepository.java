package com.example.btvn_md4.repository;

import com.example.btvn_md4.model.Category;
import com.example.btvn_md4.model.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICategoryRepository extends CrudRepository<Category, Long> {
}
