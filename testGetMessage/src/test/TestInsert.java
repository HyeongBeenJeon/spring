package test;

import springMybatis0204.mapper.DepartmentMapper;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:config/springContext.xml")
public class TestInsert
{
	@Autowired
	DepartmentMapper departmentMapper;
	public void InsertTest()
	{
		Department department = new Department();
		department.setDeptName("ÃÑ¹«1ÆÀ");
		department.setDeptLoc("ÆÇ±³");
		int rs = departmentMapper.insertDepartment(department);
		System.out.println(rs + "·Î¿ì¸¦ »ðÀÔÇß½À´Ï´Ù.");
		System.out.println(department.getId());
	}
}