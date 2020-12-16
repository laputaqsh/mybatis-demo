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

    List<Employee> getEmpsLikeTitle(String title);

    List<Employee> getEmpsOrderByIdDesc();

    List<Employee> getEmpsByPage(RowBounds bounds);

    Map<String, Object> getEmpToMapById(Integer id);

    @MapKey("title")
    Map<String, Employee> getEmpToMapLikeTitle(String title);

    Employee getEmpByMapping(Integer id);

    Employee getEmpByIdWithDep1(Integer id);

    Employee getEmpByIdWithDep2(Integer id);

    Employee getEmpByIdWithDep3(Integer id);

    Employee getEmpByDepId(Integer depId);

    Employee getDepWithGirl(Integer id);

    List<Employee> getEmpsByConditionIf(Employee emp);

    boolean updateEmpByConditionIf(Employee emp);
}
