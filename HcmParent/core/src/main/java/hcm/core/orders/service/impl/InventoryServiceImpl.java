package hcm.core.orders.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.hand.hap.core.IRequest;

import hcm.core.orders.dto.Inventory;
import hcm.core.orders.mapper.InventoryMapper;
import hcm.core.orders.service.IInventoryService;


@Service
public class InventoryServiceImpl implements IInventoryService {

	@Autowired
    private InventoryMapper inventoryMapper;

	@Override
	public List<Inventory> selectAllItems(IRequest requestContext, Inventory inventory, int page, int pagesize) {
		// TODO Auto-generated method stub
		PageHelper.startPage(page, pagesize);
		return inventoryMapper.selectAllItems(inventory);
	}


	
	
}
