package com.yordan.petrov.git.dao.controllers;

import com.yordan.petrov.git.dao.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Controller;


@Controller
public class AppController implements CommandLineRunner {

    private final CategoryService categoryService;
@Autowired
    public AppController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @Override
    public void run(String... args) throws Exception {

this.categoryService.seedCategories();



    }
}
