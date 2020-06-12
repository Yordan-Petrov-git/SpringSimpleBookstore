package com.yordan.petrov.git.dao.services.impl;

import com.yordan.petrov.git.dao.constants.GlobalConstants;
import com.yordan.petrov.git.dao.entity.Cathegory;
import com.yordan.petrov.git.dao.repositories.CategoryRepository;
import com.yordan.petrov.git.dao.services.CategoryService;
import com.yordan.petrov.git.dao.utils.FileUtil;
import org.hibernate.internal.build.AllowPrintStacktrace;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.sql.Array;
import java.util.Arrays;
import java.util.Locale;


@Service
public class CategoryServiceImpl implements CategoryService {

    private final CategoryRepository categoryRepository;
    private final FileUtil fileUtil;

    @Autowired
    public CategoryServiceImpl(CategoryRepository categoryRepository, FileUtil fileUtil) {
        this.categoryRepository = categoryRepository;
        this.fileUtil = fileUtil;
    }

    @Override
    public void seedCategories() throws IOException {

        //TODO FIX IF CATEGORY IS ALREDY IN CHECK
        if(this.categoryRepository.count() != 0 ){
            return;
        }


        String [] fileContent =
             this.fileUtil.readFileContent(GlobalConstants.CATEGORIES_FILE_PATH);


        Arrays.stream(fileContent)
                .forEach(r ->{

                    Cathegory  cathegory = new Cathegory(r);
                    this.categoryRepository.saveAndFlush(cathegory);


                });

    }
}
