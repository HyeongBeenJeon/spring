package test;

import springMybatis0204.dto.Department;
import springMybatis0204.mapper.DepartmentMapper;

public class TestInsert
{
	public void InsertTest(DepartmentMapper departmentMapper;)
	{
		Department department = new Department();
		department.setDeptName("�ѹ�1��");
		department.setDeptLoc("�Ǳ�");
		int rs = departmentMapper.insertDepartment(department);
		System.out.println(rs + "�ο츦 �����߽��ϴ�.");
		System.out.println(department.getId());
	}
}