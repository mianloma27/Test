package com.co.catastro.repositorio;

import com.co.catastro.dao.Test;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TestRepository extends MongoRepository<Test, String> {
}
