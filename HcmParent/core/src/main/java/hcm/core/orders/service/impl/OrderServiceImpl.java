package hcm.core.orders.service.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.hand.hap.core.IRequest;
import com.hand.hap.system.service.impl.BaseServiceImpl;

import hcm.core.orders.dto.Order;
import hcm.core.orders.dto.OrderHeader;
import hcm.core.orders.mapper.OrderMapper;
import hcm.core.orders.service.IOrderService;

@Service
public class OrderServiceImpl extends BaseServiceImpl<Order> implements IOrderService {

    @Autowired
    private OrderMapper orderMapper;

	public List<Order> selectAllOrders(IRequest requestContext,Order order, int page, int pagesize) {
		// TODO Auto-generated method stub
		PageHelper.startPage(page, pagesize);
		return orderMapper.selectAllOrders(order); 
	}

	@Override
	public int insertOrderHeader(OrderHeader orderHeader) {
		int flag=orderMapper.insertOrderHeader(orderHeader);
		return flag;
	}


}
