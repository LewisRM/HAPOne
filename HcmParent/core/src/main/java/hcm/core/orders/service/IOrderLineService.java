package hcm.core.orders.service;

import java.util.List;

import com.hand.hap.core.IRequest;
import com.hand.hap.core.ProxySelf;
import com.hand.hap.core.annotation.StdWho;
import com.hand.hap.system.service.IBaseService;

import hcm.core.orders.dto.OrderLine;


public interface IOrderLineService extends IBaseService<OrderLine>, ProxySelf<IOrderLineService> {
	List<OrderLine> batchUpdate(IRequest requestContext, @StdWho List<OrderLine> orderlines);

}
