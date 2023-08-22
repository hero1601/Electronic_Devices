package com.project.electronic.Controller;

import com.project.electronic.Model.Category;
import com.project.electronic.Repository.CategoryRepository;
import com.project.electronic.Service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path="/")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    @GetMapping(path = "/category")
    public List<Category> GetALlCategories(){
        return categoryService.getAllCategories();
    }

    @GetMapping(path = "/category/{id}")
    public Optional<Category> CategoryById(@PathVariable Integer id){
        return categoryService.FindCategoryById(id);
    }

    @PostMapping(path = "/category")
    public Category AddCategory(Category category){
        return categoryService.AddCategory(category);
    }

    @DeleteMapping(path = "/category/{id}")
    public String DeleteCategory(@PathVariable Integer id){
        return categoryService.RemoveCategory(id);
    }

    @PutMapping(path = "/category")
    public String UpdateCategory(Category category){
        return categoryService.UpdateCategory(category);
    }

}
