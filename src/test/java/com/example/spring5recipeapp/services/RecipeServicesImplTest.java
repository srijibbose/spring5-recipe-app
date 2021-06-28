package com.example.spring5recipeapp.services;

import com.example.spring5recipeapp.domain.Recipe;
import com.example.spring5recipeapp.repositories.RecipeRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class RecipeServicesImplTest {
    RecipeServicesImpl recipeServices;

    @Mock
    RecipeRepository recipeRepository;

    @BeforeEach
    public void setUp() throws Exception{
        MockitoAnnotations.initMocks(this);

        recipeServices = new RecipeServicesImpl(recipeRepository);
    }

    @Test
    public void getRecipes() throws Exception{


    }

}