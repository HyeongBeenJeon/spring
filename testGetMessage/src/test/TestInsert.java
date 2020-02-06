package test;

public class TestInsert
{
	public void InsertTest()
	{
		Department department = new Department();
		department.setDeptName("ÃÑ¹«2ÆÀ");
		department.setDeptLoc("°­³²");
		int rs = departmentMapper.insertDepartment(department);
		System.out.println(rs + "·Î¿ì¸¦ »ğÀÔÇß½À´Ï´Ù.");
		System.out.println(department.getId());
	}
}