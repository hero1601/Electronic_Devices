package com.project.electronic.Service;

import com.project.electronic.Model.Category;
import com.project.electronic.Repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;

    public List<Category> getAllCategories(){
        Iterable<Category> categories=categoryRepository.findAll();
        List<Category> elements=new ArrayList<Category>();
        categories.forEach(elements::add);
        return elements;
    }

    public Optional<Category> FindCategoryById(Integer id){
        return categoryRepository.findById(id);
    }

    public Category AddCategory(Category category){
        Category new_category=new Category();
        new_category.setId(category.getId());
        new_category.setName(category.getName());
        categoryRepository.save(new_category);
        return new_category;
    }

    public String RemoveCategory(Integer id){
        Optional<Category> category=FindCategoryById(id);
        if (category.isPresent()){
            categoryRepository.delete(category.get());
            return "Category Deleted";
        }
        return "No such category found";
    }

    public String UpdateCategory(Category category){
        Optional<Category> old_category=FindCategoryById(category.getId());
        if(old_category.isEmpty()){
            return "Wrong Id Provided";
        }
        else{
            Category updated_category=old_category.get();
            updated_category.setName(category.getName());
            categoryRepository.save(updated_category);
            return "Category Id "+updated_category.getId()+" has been updated";
        }
    }

}
