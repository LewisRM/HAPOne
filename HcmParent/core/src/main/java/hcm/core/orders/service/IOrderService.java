package hcm.core.orders.service;

import java.util.List;

import com.hand.hap.core.IRequest;
import com.hand.hap.core.ProxySelf;
import com.hand.hap.system.service.IBaseService;

import hcm.core.orders.dto.Order;
import hcm.core.orders.dto.OrderHeader;

public interface IOrderService extends IBaseService<Order>, ProxySelf<IOrderService> {
    
	    List<Order> selectAllOrders(IRequest requestContext,Order order, int page, int pagesize);
	    
	    int insertOrderHeader(OrderHeader orderHeader);
	}


