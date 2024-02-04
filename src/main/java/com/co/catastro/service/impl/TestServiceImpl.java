package com.co.catastro.service.impl;

import com.co.catastro.dao.Test;
import com.co.catastro.repositorio.TestRepository;
import com.co.catastro.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestServiceImpl implements TestService {


    @Autowired
    private TestRepository testRepository;

    public TestServiceImpl() {
    }

    @Override
    public List<Test> cargarTodo() {
        return testRepository.findAll();
    }

    @Override
    public void save(Test test) {

        testRepository.save(test);
    }
}
