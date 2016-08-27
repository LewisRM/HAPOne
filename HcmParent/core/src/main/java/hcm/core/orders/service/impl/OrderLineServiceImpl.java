package hcm.core.orders.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.hand.hap.core.IRequest;
import com.hand.hap.system.dto.DTOStatus;
import com.hand.hap.system.service.impl.BaseServiceImpl;

import hcm.core.orders.dto.OrderLine;
import hcm.core.orders.mapper.OrderLineMapper;
import hcm.core.orders.service.IOrderLineService;

@Service
@Transactional
public class OrderLineServiceImpl extends BaseServiceImpl<OrderLine> implements IOrderLineService {

	@Autowired
    private OrderLineMapper orderLineMapper;
	
	@Override
	@Transactional(propagation = Propagation.SUPPORTS)
    public List<OrderLine> batchUpdate(IRequest requestContext, List<OrderLine> orderlines) {
        // TODO Auto-generated method stub
        for (OrderLine orderline : orderlines) {
            if (orderline.get__status() != null) {
                switch (orderline.get__status()) {
                case DTOStatus.ADD:
                	orderLineMapper.insertOrderLine(orderline);
                    break;
                case DTOStatus.UPDATE:
                	//orderLineMapper.updateFruit(orderline);
                    break;
                case DTOStatus.DELETE:
                	//fruitMapper.deleteFruit(orderline);
                    self().deleteByPrimaryKey(orderline);
                    break;
                default:
                    break;
                }
            }
        }
        return orderlines;
    }

}
