package com.sandbox.departmentservice.service;

import com.sandbox.departmentservice.entity.Department;
import com.sandbox.departmentservice.repository.DepartmentRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService {
    @Autowired
    private DepartmentRepository departmentRepository;

    public Department saveDepartment(Department department) {
        return departmentRepository.save(department);
    }

    public Department getDepartment(Long departmentId) {
        return departmentRepository.findByDepartmentid(departmentId);
    }
}
