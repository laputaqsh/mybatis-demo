package org.laputa.mybatis.mapper;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.laputa.mybatis.entity.Department;
import org.laputa.mybatis.utils.SqlSessionUtil;

import java.io.IOException;

import static org.junit.Assert.*;

public class DepartmentMapperTest {

    @Test
    public void getDepById() {
        try {
            SqlSession session = SqlSessionUtil.getSqlSession();
            DepartmentMapper mapper = session.getMapper(DepartmentMapper.class);

            Department dep = mapper.getDepById(2);
            System.out.println(dep);

            session.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void getDepByIdWithEmps1() {
        try {
            SqlSession session = SqlSessionUtil.getSqlSession();
            DepartmentMapper mapper = session.getMapper(DepartmentMapper.class);

            Department dep = mapper.getDepByIdWithEmps1(2);
            System.out.println(dep);

            session.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void getDepByIdWithEmps2() {
        try {
            SqlSession session = SqlSessionUtil.getSqlSession();
            DepartmentMapper mapper = session.getMapper(DepartmentMapper.class);

            Department dep = mapper.getDepByIdWithEmps2(2);
            System.out.println(dep);

            session.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}