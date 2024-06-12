package com.anosman.tacos.repositories;

import com.anosman.tacos.TacoOrder;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.data.cassandra.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.UUID;

public interface TacoOrderRepository extends CassandraRepository<TacoOrder, UUID> {
}
