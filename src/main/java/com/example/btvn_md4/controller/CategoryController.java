package com.example.btvn_md4.controller;

import com.example.btvn_md4.service.CategoryService;
import com.example.btvn_md4.model.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/categories")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    @GetMapping
    public ModelAndView display(){
        ModelAndView modelAndView =new ModelAndView("/category/display");
        modelAndView.addObject("category", categoryService.findAll());
        return modelAndView;
    }

    @GetMapping("/create")
    public ModelAndView fromCreate(){
        ModelAndView modelAndView= new ModelAndView("/create");
        modelAndView.addObject("category", new Category());
        return modelAndView;
    }

    @PostMapping(value = "/create")
    public String create(Category category){
        categoryService.save(category);
        return "redirect:/category";
    }

}
