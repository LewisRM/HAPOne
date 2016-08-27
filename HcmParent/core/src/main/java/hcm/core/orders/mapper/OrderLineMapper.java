package hcm.core.orders.mapper;

import com.hand.hap.mybatis.common.Mapper;

import hcm.core.orders.dto.OrderLine;

/**
 * Created by hailor on 16/6/2.
 */
public interface OrderLineMapper extends Mapper<OrderLine> {
	int insertOrderLine(OrderLine orderrLine);
}
