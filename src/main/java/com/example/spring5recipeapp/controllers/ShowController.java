package com.example.spring5recipeapp.controllers;

import com.example.spring5recipeapp.domain.Recipe;
import com.example.spring5recipeapp.repositories.RecipeRepository;
import com.example.spring5recipeapp.services.RecipeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Slf4j
@Controller
public class ShowController {
    private final RecipeService recipeService;

    public ShowController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @RequestMapping({"recipe/show/{id}"})
    public String showShowPage(@PathVariable String id, Model model){

        model.addAttribute("recipe", recipeService.findById(Long.valueOf(id)));
        return "recipe/show";
    }
}
