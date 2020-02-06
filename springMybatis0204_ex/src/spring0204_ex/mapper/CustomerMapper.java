package spring0204_ex.mapper;

import java.util.List;

import spring0204_ex.dto.CustomerDto;

public interface CustomerMapper {
	
	public int insertCustomer(CustomerDto customer);
	
	public List<CustomerDto> selectList();
	
	public int countReview(CustomerDto customer);
	
//	public int countUpdate(Object object);

	public int countReview(int a);

	public void countUpdate(CustomerDto customerDto);

//	public void countUpdate(Object countReview);

}