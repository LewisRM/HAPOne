package hcm.core.orders.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hand.hap.system.service.impl.BaseServiceImpl;

import hcm.core.orders.dto.OrderHeader;
import hcm.core.orders.service.IOrderHeaderService;

@Service
@Transactional
public class OrderHeaderServiceImpl extends BaseServiceImpl<OrderHeader> implements IOrderHeaderService {

	
}
