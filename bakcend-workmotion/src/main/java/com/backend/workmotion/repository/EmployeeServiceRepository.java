package com.backend.workmotion.repository;

import com.backend.workmotion.entity.Employee;
import com.backend.workmotion.enums.EmployeeState;
import com.backend.workmotion.model.EmployeeRequestBody;
import com.backend.workmotion.model.EmployeeResponseBody;

public interface EmployeeServiceRepository {

    EmployeeResponseBody createEmployee(Employee employee);
    void changeEmployeeState(Employee employee, EmployeeState state);
    EmployeeResponseBody getEmployeeInfos(Long id);
}
