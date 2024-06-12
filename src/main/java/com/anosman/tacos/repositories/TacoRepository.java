package com.anosman.tacos.repositories;

import com.anosman.tacos.Taco;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.data.repository.CrudRepository;

public interface TacoRepository extends CassandraRepository<Taco, Long> {
}
