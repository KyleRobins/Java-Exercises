package com.example.springboot.service;

import com.example.springboot.dao.IngredientDao;
import com.example.springboot.model.Ingredient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class IngredientService {

    private final IngredientDao ingredientRepository;

    @Autowired
    public IngredientService(IngredientDao ingredientRepository) {
        this.ingredientRepository = ingredientRepository;
    }

    public List<com.example.springboot.controller.Ingredient> getAllIngredients() {
        return ingredientRepository.findAll();
    }

    public Optional<Ingredient> getIngredientById(Long id) {
        return ingredientRepository.findById(id);
    }

    public Ingredient createIngredient(Ingredient ingredient) {
        return ingredientRepository.save(ingredient);
    }

    public Ingredient updateIngredient(Long id, Ingredient ingredient) {
        if (ingredientRepository.existsById(id)) {
            ingredient.setId(id);
            return ingredientRepository.save(ingredient);
        }
        return null; // Handle error, ingredient with given id not found
    }

    public void deleteIngredient(Long id) {
        ingredientRepository.deleteById(id);
    }
}
