package com.anosman.tacos.repositories;

import com.anosman.tacos.Ingredient;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;

public interface IngredientRepository extends MongoRepository<Ingredient, String> {
}
