package org.laputa.mybatis.mapper;

import org.laputa.mybatis.entity.Employee;

import java.util.List;

public interface EmployeeMapper {
    Long addEmp(Employee emp);

    List<Employee> getAllEmps();

    Employee getEmpById(Integer id);

    Long updateEmp(Employee emp);

    Long delEmpById(Integer id);
}
