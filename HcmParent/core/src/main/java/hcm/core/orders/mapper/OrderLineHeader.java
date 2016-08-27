package hcm.core.orders.mapper;

import com.hand.hap.mybatis.common.Mapper;

import hcm.core.orders.dto.OrderHeader;


public interface OrderLineHeader extends Mapper<OrderHeader> {
	int insertOrderHeader(OrderHeader orderHeader);
}
