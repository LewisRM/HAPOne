package hcm.core.orders.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.hand.hap.core.IRequest;

import hcm.core.orders.dto.Customers;
import hcm.core.orders.mapper.CustomerMapper;
import hcm.core.orders.service.ICustomerService;


@Service
public class CustomerServiceImpl implements ICustomerService {
   
	
	@Autowired
    private CustomerMapper customerMapper;

	@Override
	public List<Customers> selectAllCustomers(IRequest requestContext, Customers customer, int page, int pagesize) {
		// TODO Auto-generated method stub
		PageHelper.startPage(page, pagesize);
		return customerMapper.selectAllCustomers(customer);
	}

}
