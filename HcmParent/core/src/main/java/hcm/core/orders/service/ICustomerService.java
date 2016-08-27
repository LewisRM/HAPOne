package hcm.core.orders.service;

import java.util.List;

import com.hand.hap.core.IRequest;
import com.hand.hap.core.ProxySelf;

import hcm.core.orders.dto.Customers;

public interface ICustomerService extends ProxySelf<ICustomerService> {
    
	    List<Customers> selectAllCustomers(IRequest requestContext,Customers customer, int page, int pagesize);
	}


