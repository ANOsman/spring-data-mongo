package com.anosman.tacos.repositories;

import com.anosman.tacos.TacoOrder;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.UUID;

public interface TacoOrderRepository extends CrudRepository<TacoOrder, String> {
}
