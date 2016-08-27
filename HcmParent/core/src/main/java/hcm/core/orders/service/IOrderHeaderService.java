package hcm.core.orders.service;

import com.hand.hap.core.ProxySelf;
import com.hand.hap.system.service.IBaseService;

import hcm.core.orders.dto.OrderHeader;


public interface IOrderHeaderService extends IBaseService<OrderHeader>, ProxySelf<IOrderHeaderService> {
	//List<OrderHeader> batchUpdate(IRequest requestContext, @StdWho List<OrderHeader> orderheaders);

}
