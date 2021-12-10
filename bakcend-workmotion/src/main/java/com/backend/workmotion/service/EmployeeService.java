package com.backend.workmotion.service;

import com.backend.workmotion.entity.Employee;
import com.backend.workmotion.enums.EmployeeState;
import com.backend.workmotion.model.EmployeeRequestBody;
import com.backend.workmotion.model.EmployeeResponseBody;
import org.springframework.web.bind.annotation.ResponseBody;

public interface EmployeeService {

    EmployeeResponseBody createEmployee(EmployeeRequestBody employee);
    void changeEmployeeState(Employee employee, EmployeeState state);
    EmployeeResponseBody getEmployeeInfos(Long id);
}
