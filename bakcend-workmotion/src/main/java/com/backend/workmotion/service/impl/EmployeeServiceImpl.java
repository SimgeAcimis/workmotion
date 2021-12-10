package com.backend.workmotion.service.impl;

import com.backend.workmotion.entity.Employee;
import com.backend.workmotion.enums.EmployeeState;
import com.backend.workmotion.model.EmployeeRequestBody;
import com.backend.workmotion.model.EmployeeResponseBody;
import com.backend.workmotion.repository.EmployeeServiceRepository;
import com.backend.workmotion.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.ResponseBody;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeServiceRepository employeeServiceRepository;
    private EmployeeResponseBody employeeResponseBody;

    @Autowired
    public EmployeeServiceImpl(EmployeeServiceRepository employeeServiceRepository) {
        this.employeeServiceRepository = employeeServiceRepository;
    }

    @Override
    public EmployeeResponseBody createEmployee(EmployeeRequestBody employee) {
        employeeResponseBody = new EmployeeResponseBody();
        Employee employee1 = new Employee();
        employee1.setName(employee.getName());
        employee1.setAge(employee.getAge());
        employee1.setTitle(employee.getTitle());
        employee1.setSalary(employee.getSalary());
        employee1.setState(EmployeeState.ADDED);
        employeeResponseBody = employeeServiceRepository.createEmployee(employee1);
        return employeeResponseBody;

    }

    @Override
    public void changeEmployeeState(Employee employee, EmployeeState state) {

    }

    @Override
    public EmployeeResponseBody getEmployeeInfos(Long id) {
        employeeResponseBody = new EmployeeResponseBody();
        employeeResponseBody = employeeServiceRepository.getEmployeeInfos(id);
        return employeeResponseBody;
    }
}
