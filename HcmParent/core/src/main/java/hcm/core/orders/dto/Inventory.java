package hcm.core.orders.dto;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "hap_inv_inventory_items")
public class Inventory {
	
   public static final String FIELD_INVENTORY_ID = "inventoryItemId";
	
	
	@Id
    @Column
    private Long inventoryItemId;

    @Column
    private String itemCode;

    @Column
    private String itemDescription;

	public Long getInventoryItemId() {
		return inventoryItemId;
	}

	public void setInventoryItemId(Long inventoryItemId) {
		this.inventoryItemId = inventoryItemId;
	}

	public String getItemCode() {
		return itemCode;
	}

	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

	public String getItemDescription() {
		return itemDescription;
	}

	public void setItemDescription(String itemDescription) {
		this.itemDescription = itemDescription;
	}

	public static String getFieldInventoryId() {
		return FIELD_INVENTORY_ID;
	}
    
    
    

}
