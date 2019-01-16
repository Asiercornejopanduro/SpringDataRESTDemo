package com.acornejo.demo.repository;

import com.acornejo.demo.pojo.Family;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "familias", path = "family")

public interface FamilyRepository extends MongoRepository<Family, String> {
}
