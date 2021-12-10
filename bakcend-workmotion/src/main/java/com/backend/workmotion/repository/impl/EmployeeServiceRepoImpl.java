package com.backend.workmotion.repository.impl;

import com.backend.workmotion.model.EmployeeRequestBody;
import com.backend.workmotion.model.EmployeeResponseBody;
import com.backend.workmotion.repository.EmployeeServiceRepository;
import com.backend.workmotion.entity.Employee;
import com.backend.workmotion.enums.EmployeeState;
import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class EmployeeServiceRepoImpl implements EmployeeServiceRepository {

    private SessionFactory sessionFactory;

    @Autowired
    public EmployeeServiceRepoImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public EmployeeResponseBody createEmployee(Employee employee) {
        EmployeeResponseBody employeeResponseBody = new EmployeeResponseBody();

        try {
            sessionFactory.getCurrentSession().save(employee);

            employeeResponseBody.setEmployee(employee);
            employeeResponseBody.setEmployeeState(employee.getState());

        }catch (Exception e){
            e.getMessage();
        }

        return employeeResponseBody;

    }

    @Override
    public void changeEmployeeState(Employee employee, EmployeeState state) {

    }

    @Override
    public EmployeeResponseBody getEmployeeInfos(Long id) {
        EmployeeResponseBody employeeResponseBody = new EmployeeResponseBody();
        Employee employee = new Employee();
        try {

            Criteria criteria = sessionFactory.getCurrentSession().createCriteria(Employee.class)
                    .add(Restrictions.eq("id", id));
            Object result = criteria.uniqueResult();
            if (result != null) {
                employee = (Employee) result;
            }
            employeeResponseBody.setEmployee(employee);
            employeeResponseBody.setEmployeeState(employee.getState());

        }catch (Exception e){
            e.getMessage();
        }
        return employeeResponseBody;
    }
}
