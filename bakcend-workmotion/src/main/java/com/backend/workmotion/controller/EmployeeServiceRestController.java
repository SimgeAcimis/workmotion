package com.backend.workmotion.controller;

import com.backend.workmotion.entity.Employee;
import com.backend.workmotion.enums.EmployeeState;
import com.backend.workmotion.model.EmployeeRequestBody;
import com.backend.workmotion.model.EmployeeResponseBody;
import com.backend.workmotion.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;


@RestController
public class EmployeeServiceRestController {

    private EmployeeService employeeService;

    @Autowired
    public EmployeeServiceRestController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @PostMapping(value = "/addEmployee", consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public @ResponseBody EmployeeResponseBody addEmployee(@RequestBody EmployeeRequestBody employee){
        EmployeeResponseBody employeeResponseBody = employeeService.createEmployee(employee);
        return employeeResponseBody;
    }

    @PostMapping(value = "/changeEmployeeState", consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public void changeEmployeeState(Employee employee, EmployeeState employeeState){
        employeeService.changeEmployeeState(employee,employeeState);
    }

    @GetMapping(value = "/getEmployeeInfo/{id}", consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public @ResponseBody EmployeeResponseBody getEmployeeInfo(@PathVariable Long id){
        EmployeeResponseBody employeeResponseBody = employeeService.getEmployeeInfos(id);
        return employeeResponseBody;

    }
}
