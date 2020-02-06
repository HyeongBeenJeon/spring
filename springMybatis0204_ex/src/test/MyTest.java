package test;

import static org.junit.Assert.assertNotNull;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import spring0204_ex.dto.CustomerDto;
import spring0204_ex.dto.ReviewDto;
import spring0204_ex.mapper.CustomerMapper;
import spring0204_ex.mapper.ReviewMapper;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:config/springContext.xml")
public class MyTest {
	
	@Autowired
	ReviewMapper reviewMapper;
	
	@Autowired
	CustomerMapper customerMapper;
	
//	//�μ�Ʈ �׽�Ʈ
//	@Test @Ignore
//	public void insertTest() {
//		customerDao.insertCustomer(new CustomerDto("maxin", "yourid", LocalDate.parse("2019-10-20"), LocalDateTime.now()));
//	}
	
	//���� �μ�Ʈ...����
	@Test
	public void insertReview() {
		int a = 6;
		ReviewDto reviewDto = new ReviewDto();
		reviewDto.setCustomerId(a);
		reviewDto.setReviewMessage("�¾� �������!");
		reviewMapper.insertReview(reviewDto);
		
		CustomerDto customerDto = new CustomerDto();
		customerDto.setCustomerId(a);
		customerDto.setReviewCnt(customerMapper.countReview(customerDto));
		customerMapper.countUpdate(customerDto);
		System.out.println(a);
	}
	
	//����Ʈ �ҷ����� �׽�Ʈ
	@Test
	public void listTest() {
		List<CustomerDto> list = customerMapper.selectList();
		for(CustomerDto customerDto : list) {
			System.out.println(customerDto);
		}
	}
}