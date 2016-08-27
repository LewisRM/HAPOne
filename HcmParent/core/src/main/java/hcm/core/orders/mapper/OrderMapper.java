package hcm.core.orders.mapper;

import java.util.List;

import com.hand.hap.mybatis.common.Mapper;

import hcm.core.orders.dto.Order;
import hcm.core.orders.dto.OrderHeader;

public interface OrderMapper extends Mapper<Order> {
	List<Order> selectAllOrders(Order order);
	int insertOrderHeader(OrderHeader orderHeader);
}
