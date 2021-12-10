package com.backend.workmotion.model;

import com.backend.workmotion.entity.Employee;
import com.backend.workmotion.enums.EmployeeState;

public class EmployeeResponseBody {

    private EmployeeState employeeState;
    private Employee employee;

    public EmployeeState getEmployeeState() {
        return employeeState;
    }

    public void setEmployeeState(EmployeeState employeeState) {
        this.employeeState = employeeState;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}
