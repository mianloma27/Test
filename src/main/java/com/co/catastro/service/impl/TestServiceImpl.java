package com.co.catastro.service.impl;

import com.co.catastro.dao.Test;
import com.co.catastro.dto.TestDto;
import com.co.catastro.repositorio.TestRepository;
import com.co.catastro.service.TestService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestServiceImpl implements TestService {

    private final ModelMapper modelMapper;

    @Autowired
    private TestRepository testRepository;

    public TestServiceImpl(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    @Override
    public List<Test> cargarTodo() {
        return testRepository.findAll();
    }

    @Override
    public void save(TestDto testDto) {

        testRepository.save(modelMapper.map(testDto, Test.class));
    }
}
