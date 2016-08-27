package hcm.core.orders.service;

import java.util.List;

import com.hand.hap.core.IRequest;
import com.hand.hap.core.ProxySelf;

import hcm.core.orders.dto.Inventory;

public interface IInventoryService extends ProxySelf<IInventoryService> {
    
	    List<Inventory> selectAllItems(IRequest requestContext,Inventory inventory, int page, int pagesize);
	}


