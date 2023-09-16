package com.example.btvn_md4.service;

import com.example.btvn_md4.model.Category;

import com.example.btvn_md4.repository.ICategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {
    @Autowired
    private ICategoryRepository categoryRepository;
    public List<Category> findAll(){
        return (List<Category>) categoryRepository.findAll();
    }
    public Category findOne(Long id){
        return categoryRepository.findById(id).get();
    }
    public void save (Category category){
        categoryRepository.save(category);
    }
    public void delete (Long id){
        Category category = findOne(id);
        categoryRepository.delete(category);
    }
}
