package com.co.catastro.service;

import com.co.catastro.dao.Test;
import com.co.catastro.dto.TestDto;

import java.util.List;

public interface TestService {
    List<Test> cargarTodo();

    void save(TestDto testDto);
}
