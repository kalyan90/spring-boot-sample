package com.sandbox.departmentservice.controller;

import com.sandbox.departmentservice.entity.Department;
import com.sandbox.departmentservice.service.DepartmentService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/departments")
@Slf4j
public class DepartmentController {
    final Logger logger = LoggerFactory.getLogger(DepartmentController.class);

    @Autowired
    private DepartmentService departmentService;  

    @PostMapping("/")
    public Department saveDepartment(@RequestBody Department department) {
        logger.info("inside create");
        Department dep = departmentService.saveDepartment(department);
        return dep;
    }

    @GetMapping("/{id}")
    public Department getDepartment(@PathVariable("id") Long departmentId){
        logger.info("inside get");
        var dep = departmentService.getDepartment(departmentId);
        return dep;
    }
}
