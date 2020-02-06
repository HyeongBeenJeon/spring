package test;

import springMybatis0204.dto.Department;
import springMybatis0204.mapper.DepartmentMapper;

public class TestInsert
{
	public void InsertTest(DepartmentMapper departmentMapper;)
	{
		Department department = new Department();
		department.setDeptName("ÃÑ¹«1ÆÀ");
		department.setDeptLoc("ÆÇ±³");
		int rs = departmentMapper.insertDepartment(department);
		System.out.println(rs + "·Î¿ì¸¦ »ğÀÔÇß½À´Ï´Ù.");
		System.out.println(department.getId());
	}
}