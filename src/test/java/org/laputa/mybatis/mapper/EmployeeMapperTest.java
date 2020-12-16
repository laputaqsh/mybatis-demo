package org.laputa.mybatis.mapper;

import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.laputa.mybatis.entity.Department;
import org.laputa.mybatis.entity.Employee;
import org.laputa.mybatis.utils.SqlSessionUtil;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class EmployeeMapperTest {

    @Test
    public void addEmp() {
        try {
            SqlSession session = SqlSessionUtil.getSqlSession();
            EmployeeMapper mapper = session.getMapper(EmployeeMapper.class);

            Employee emp = new Employee();

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
    public void getEmpsLikeTitle() {
        try {
            SqlSession session = SqlSessionUtil.getSqlSession();
            EmployeeMapper mapper = session.getMapper(EmployeeMapper.class);

            List<Employee> emps = mapper.getEmpsLikeTitle("小");
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
    public void getEmpToMapLikeTitle() {
        try {
            SqlSession session = SqlSessionUtil.getSqlSession();
            EmployeeMapper mapper = session.getMapper(EmployeeMapper.class);

            Map<String, Employee> empMap = mapper.getEmpToMapLikeTitle("%小%");
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

            Employee emp = mapper.getEmpByIdWithDep1(2);
            System.out.println(emp);

            session.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void getEmpByIdWithDep2() {
        try {
            SqlSession session = SqlSessionUtil.getSqlSession();
            EmployeeMapper mapper = session.getMapper(EmployeeMapper.class);

            Employee emp = mapper.getEmpByIdWithDep2(2);
            System.out.println(emp);

            session.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void getEmpByIdWithDep3() {
        try {
            SqlSession session = SqlSessionUtil.getSqlSession();
            EmployeeMapper mapper = session.getMapper(EmployeeMapper.class);

            Employee emp = mapper.getEmpByIdWithDep3(2);
            System.out.println(emp);

            session.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void getEmpByDepId() {
        try {
            SqlSession session = SqlSessionUtil.getSqlSession();
            EmployeeMapper mapper = session.getMapper(EmployeeMapper.class);

            Employee emp = mapper.getEmpByDepId(2);
            System.out.println(emp);

            session.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void getDepWithGirl() {
        try {
            SqlSession session = SqlSessionUtil.getSqlSession();
            EmployeeMapper mapper = session.getMapper(EmployeeMapper.class);

            Employee emp1 = mapper.getDepWithGirl(3);
            System.out.println(emp1);

            Employee emp2 = mapper.getDepWithGirl(4);
            System.out.println(emp2);

            session.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void getEmpsByConditionIf() {
        try {
            SqlSession session = SqlSessionUtil.getSqlSession();
            EmployeeMapper mapper = session.getMapper(EmployeeMapper.class);

            Employee emp = new Employee();
            emp.setId(2);

            List<Employee> emps = mapper.getEmpsByConditionIf(emp);
            System.out.println(emps);

            session.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void updateEmpByConditionIf() {
        try {
            SqlSession session = SqlSessionUtil.getSqlSession();
            EmployeeMapper mapper = session.getMapper(EmployeeMapper.class);

            Department dep = new Department();
            dep.setId(1);

            Employee emp = new Employee();
            emp.setId(8);
            emp.setDep(dep);
            boolean b = mapper.updateEmpByConditionIf(emp);
            System.out.println(b);

            session.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}