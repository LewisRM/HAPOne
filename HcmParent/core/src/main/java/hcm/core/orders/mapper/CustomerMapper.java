package hcm.core.orders.mapper;

import java.util.List;

import hcm.core.orders.dto.Customers;

public interface CustomerMapper{
	List<Customers> selectAllCustomers(Customers customer);
}
