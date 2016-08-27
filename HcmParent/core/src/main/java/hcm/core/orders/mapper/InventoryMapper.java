package hcm.core.orders.mapper;

import java.util.List;

import com.hand.hap.mybatis.common.Mapper;

import hcm.core.orders.dto.Inventory;

public interface InventoryMapper extends Mapper<Inventory> {
	List<Inventory> selectAllItems(Inventory inventory);
}
