package com.acornejo.demo.repository;

import com.acornejo.demo.pojo.Person;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "personas", path = "person")
public interface PersonRepository extends MongoRepository<Person, String> {
    List<Person> findByNombre(@Param("nombre") String name);
}
