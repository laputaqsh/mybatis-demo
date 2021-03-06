package org.laputa.mybatis.mapper;

import org.laputa.mybatis.entity.Department;

public interface DepartmentMapper {
    Department getDepById(Integer id);

    Department getDepByIdWithEmps1(Integer id);

    Department getDepByIdWithEmps2(Integer id);
}
