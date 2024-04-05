package org.example.springdatasandbox;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MyEntityRepo extends CrudRepository<MyEntity, Long> {
}
