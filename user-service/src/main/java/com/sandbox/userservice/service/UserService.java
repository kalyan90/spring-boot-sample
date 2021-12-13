package com.sandbox.userservice.service;

import com.sandbox.userservice.entity.User;
import com.sandbox.userservice.repository.UserRepository;
import com.sandbox.userservice.viewmodel.Department;
import com.sandbox.userservice.viewmodel.UserResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RestTemplate restTemplate;

    public User saveUser(User user) {
        return userRepository.save(user);
    }

    public User getUserById(Long userId) {
        return userRepository.getByUserid(userId);
    }

    public UserResponse getUserWithDeparmentById(Long userId) {
        var user = getUserById(userId);
        Department department = restTemplate.getForObject("http://DEPARTMENT-SERVICE/departments/"+user.getDepartmentid(), Department.class);

        var response = new UserResponse();
        response.setUser(user);
        response.setDepartment(department);
        return response;
    }
}
