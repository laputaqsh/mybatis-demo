package org.laputa.mybatis.mapper;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.laputa.mybatis.entity.Employee;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class EmployeeMapperTest {

    @Test
    public void addEmp() {
        try {
            String resource = "mybatis-config.xml";
            InputStream stream = Resources.getResourceAsStream(resource);
            SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
            SqlSessionFactory factory = builder.build(stream);
            SqlSession session = factory.openSession(true);
            EmployeeMapper mapper = session.getMapper(EmployeeMapper.class);

            Employee emp = new Employee();
            emp.setName("wangwu");
            emp.setEmail("wang1004@qq.com");
            emp.setGender("male");

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
            String resource = "mybatis-config.xml";
            InputStream stream = Resources.getResourceAsStream(resource);
            SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
            SqlSessionFactory factory = builder.build(stream);
            SqlSession session = factory.openSession(true);
            EmployeeMapper mapper = session.getMapper(EmployeeMapper.class);

            List<Employee> emps = mapper.getAllEmps();
            for (Employee emp : emps) {
                System.out.println(emp);
            }

            session.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void getEmpById() {
        try {
            String resource = "mybatis-config.xml";
            InputStream stream = Resources.getResourceAsStream(resource);
            SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
            SqlSessionFactory factory = builder.build(stream);
            SqlSession session = factory.openSession(true);
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
            String resource = "mybatis-config.xml";
            InputStream stream = Resources.getResourceAsStream(resource);
            SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
            SqlSessionFactory factory = builder.build(stream);
            SqlSession session = factory.openSession(true);
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
            String resource = "mybatis-config.xml";
            InputStream stream = Resources.getResourceAsStream(resource);
            SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
            SqlSessionFactory factory = builder.build(stream);
            SqlSession session = factory.openSession(true);
            EmployeeMapper mapper = session.getMapper(EmployeeMapper.class);

            Long rowCounts = mapper.delEmpById(1);
            System.out.println("影响行数：" + rowCounts);

            session.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}