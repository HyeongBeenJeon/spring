package springMybatis0204.mapper;

import java.util.List;

import springMybatis0204.Dto.Employee;

public interface EmployeeMapper {
	
	//직원 리스트를 가져오는 메소드
	public List<Employee> selectList();
	
	

}
