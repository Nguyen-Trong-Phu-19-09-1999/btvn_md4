package com.example.btvn_md4.controller;

import com.example.btvn_md4.service.CategoryService;
import com.example.btvn_md4.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/products")
public class ProductController {
    @Autowired
    private ProductService productService;
    @Autowired
    private CategoryService categoryService;

    @GetMapping
    public ModelAndView display(){
        ModelAndView modelAndView = new ModelAndView("/display");
        modelAndView.addObject("product", productService.findAll());
        modelAndView.addObject("category", categoryService.findAll());
        return modelAndView;
    }
}
