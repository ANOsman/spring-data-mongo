package com.anosman.tacos.repositories;

import com.anosman.tacos.Ingredient;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;

public interface IngredientRepository extends CassandraRepository<Ingredient, String> {
}
