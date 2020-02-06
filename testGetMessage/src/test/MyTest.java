package test;

import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import springMybatis0204.Dto.Department;
import springMybatis0204.Dto.Employee;
import springMybatis0204.mapper.DepartmentMapper;
import springMybatis0204.mapper.EmployeeMapper;
import springMybatis0204.test.TestInsert;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:config/springContext.xml")
public class MyTest {
		
	@Autowired
	EmployeeMapper employeeMapper;
	
	@Autowired
	DepartmentMapper departmentMapper;
	
	TestInsert ti = new Testinsert();
	
	@Test @Ignore
	public void test() {
		assertNotNull(employeeMapper);
		List<Employee> list = employeeMapper.selectList();
		for(Employee employee : list) {
			System.out.println(employee);
		}
	}
	
	@Test @Ignore
	public void testDepartmentMapper() {
		Department department = new Department();
		department.setDeptName("ÃÑ¹«2ÆÀ");
		department.setDeptLoc("°­³²");
		int rs = departmentMapper.insertDepartment(department);
		System.out.println(rs + "·Î¿ì¸¦ »ðÀÔÇß½À´Ï´Ù.");
		System.out.println(department.getId());
	}
	
	@Test
	public void testGit()
	{
		ti.InsertTest(departmentMapper);
	}

}
