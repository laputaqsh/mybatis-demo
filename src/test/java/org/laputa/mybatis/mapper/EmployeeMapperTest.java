package org.laputa.mybatis.mapper;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.laputa.mybatis.entity.Employee;
import org.laputa.mybatis.utils.SqlSessionUtil;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;

public class EmployeeMapperTest {

    @Test
    public void addEmp() {
        try {
            SqlSession session = SqlSessionUtil.getSqlSession();
            EmployeeMapper mapper = session.getMapper(EmployeeMapper.class);

            Employee emp = new Employee();
            emp.setName("老九");
            emp.setEmail("123@qq.com");
            emp.setGender("男");

            Long rowCounts = mapper.addEmp(emp);
            System.out.println("影响行数：" + rowCounts);

            session.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void getAllEmps() {
        try {
            SqlSession session = SqlSessionUtil.getSqlSession();
            EmployeeMapper mapper = session.getMapper(EmployeeMapper.class);

            Map<String, Object> empMap = mapper.getEmpToMapById(2);
            for (String key : empMap.keySet()) {
                Object val = empMap.get(key);
                System.out.println(key + ": " + val);
            }

            session.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void getEmpById() {
        try {
            SqlSession session = SqlSessionUtil.getSqlSession();
            EmployeeMapper mapper = session.getMapper(EmployeeMapper.class);

            Employee emp = mapper.getEmpById(2);
            System.out.println(emp);

            session.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void updateEmp() {
        try {
            SqlSession session = SqlSessionUtil.getSqlSession();
            EmployeeMapper mapper = session.getMapper(EmployeeMapper.class);

            Employee emp = mapper.getEmpById(2);
            emp.setEmail("lisi1994@126.com");
            Long rowCounts = mapper.updateEmp(emp);
            System.out.println("影响行数：" + rowCounts);

            session.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void delEmpById() {
        try {
            SqlSession session = SqlSessionUtil.getSqlSession();
            EmployeeMapper mapper = session.getMapper(EmployeeMapper.class);

            Long rowCounts = mapper.delEmpById(1);
            System.out.println("影响行数：" + rowCounts);

            session.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void getEmpsLikeName() {
        try {
            SqlSession session = SqlSessionUtil.getSqlSession();
            EmployeeMapper mapper = session.getMapper(EmployeeMapper.class);

            List<Employee> emps = mapper.getEmpsLikeName("发到");
            for (Employee emp : emps) {
                System.out.println(emp);
            }

            session.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void getEmpsOrderByIdDesc() {
        try {
            SqlSession session = SqlSessionUtil.getSqlSession();
            EmployeeMapper mapper = session.getMapper(EmployeeMapper.class);

            List<Employee> emps = mapper.getEmpsOrderByIdDesc();
            for (Employee emp : emps) {
                System.out.println(emp);
            }

            session.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void getEmpsByPage() {
        try {
            SqlSession session = SqlSessionUtil.getSqlSession();
            EmployeeMapper mapper = session.getMapper(EmployeeMapper.class);

            RowBounds bounds = new RowBounds(3, 2);
            List<Employee> emps = mapper.getEmpsByPage(bounds);
            for (Employee emp : emps) {
                System.out.println(emp);
            }

            session.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void getEmpToMapById() {
        try {
            SqlSession session = SqlSessionUtil.getSqlSession();
            EmployeeMapper mapper = session.getMapper(EmployeeMapper.class);

            Map<String, Object> empMap = mapper.getEmpToMapById(2);
            for (String key : empMap.keySet()) {
                Object val = empMap.get(key);
                System.out.println(key + ": " + val);
            }

            session.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void getEmpToMapLikeName() {
        try {
            SqlSession session = SqlSessionUtil.getSqlSession();
            EmployeeMapper mapper = session.getMapper(EmployeeMapper.class);

            Map<String, Employee> empMap = mapper.getEmpToMapLikeName("%小%");
            for (String key : empMap.keySet()) {
                Employee val = empMap.get(key);
                System.out.println(key + ": " + val);
            }

            session.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void getEmpByMapping() {
        try {
            SqlSession session = SqlSessionUtil.getSqlSession();
            EmployeeMapper mapper = session.getMapper(EmployeeMapper.class);

            Employee emp = mapper.getEmpByMapping(2);
            System.out.println(emp);

            session.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void getEmpByIdWithDep1() {
        try {
            SqlSession session = SqlSessionUtil.getSqlSession();
            EmployeeMapper mapper = session.getMapper(EmployeeMapper.class);

            Employee employee = mapper.getEmpByIdWithDep1(2);
            System.out.println(employee);

            session.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}