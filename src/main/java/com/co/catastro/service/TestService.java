package com.co.catastro.service;

import com.co.catastro.dao.Test;

import java.util.List;

public interface TestService {
    List<Test> cargarTodo();

    void save(Test test);
}
