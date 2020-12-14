package org.laputa.mybatis.mapper;

import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.session.RowBounds;
import org.laputa.mybatis.entity.Employee;

import java.util.List;
import java.util.Map;

public interface EmployeeMapper {
    Long addEmp(Employee emp);

    List<Employee> getAllEmps();

    Employee getEmpById(Integer id);

    Long updateEmp(Employee emp);

    Long delEmpById(Integer id);

    List<Employee> getEmpsLikeName(String name);

    List<Employee> getEmpsOrderByIdDesc();

    List<Employee> getEmpsByPage(RowBounds bounds);

    Map<String, Object> getEmpToMapById(Integer id);

    @MapKey("name")
    Map<String, Employee> getEmpToMapLikeName(String name);

    Employee getEmpByMapping(Integer id);

    Employee getEmpByIdWithDep1(Integer id);

    Employee getEmpByIdWithDep2(Integer id);

    Employee getEmpByIdWithDep3(Integer id);
}
