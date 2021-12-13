package com.sandbox.departmentservice.repository;

import com.sandbox.departmentservice.entity.Department;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long>{

    Department findByDepartmentid(Long departmentId);
    
}
