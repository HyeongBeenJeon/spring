package test;

public class TestInsert
{
	public void InsertTest()
	{
		Department department = new Department();
		department.setDeptName("�ѹ�2��");
		department.setDeptLoc("����");
		int rs = departmentMapper.insertDepartment(department);
		System.out.println(rs + "�ο츦 �����߽��ϴ�.");
		System.out.println(department.getId());
	}
}