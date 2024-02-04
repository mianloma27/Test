package com.co.catastro.controller;

import com.co.catastro.dao.Test;
import com.co.catastro.dto.TestDto;
import com.co.catastro.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tareas")
public class TestController {

    @Autowired
    private TestService testService;

    @GetMapping
    public ResponseEntity<List<Test>> obtenerTodasLasTareas() {
        List<Test> lstTest = testService.cargarTodo();
        return ResponseEntity.ok(lstTest);
    }

    @PostMapping
    public void guardar(@RequestBody Test test){
        testService.save(test);
    }
}
