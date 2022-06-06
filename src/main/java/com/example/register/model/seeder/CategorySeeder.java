package com.example.register.model.seeder;


import com.example.register.model.CategoryModel;
import com.example.register.model.MySqlCategoryModel;

public class CategorySeeder {
    private CategoryModel categoryModel;

    public CategorySeeder() {
        this.categoryModel = new MySqlCategoryModel();
    }

    public void seedData() {
    }
}
