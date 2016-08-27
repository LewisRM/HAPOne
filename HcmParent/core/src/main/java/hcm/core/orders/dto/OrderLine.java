package hcm.core.orders.dto;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

import com.hand.hap.system.dto.BaseDTO;


@Table(name = "hap_om_order_lines")
public class OrderLine  extends BaseDTO {
	
    public static final String FIELD_ORDERSlINE_ID = "lineId";
	
	
	
	@Id
    @Column
    private Long lineId;

	@Column
	private Long headerId;
	
	@Column
	private Long lineNumber;
	
	@Column
	private Long inventoryItemId;
	
	@Column
	private Long orderQuantity;
	
	@Column
	private Long unitSellingPricae;
	
	@Column
	private String orderQuantityUom;
	
	@Column
	private String description;
	
	@Column
	private Long companyId;

	public Long getLineId() {
		return lineId;
	}

	public void setLineId(Long lineId) {
		this.lineId = lineId;
	}



	public Long getHeaderId() {
		return headerId;
	}

	public void setHeaderId(Long headerId) {
		this.headerId = headerId;
	}

	public Long getLineNumber() {
		return lineNumber;
	}

	public void setLineNumber(Long lineNumber) {
		this.lineNumber = lineNumber;
	}

	public Long getInventoryItemId() {
		return inventoryItemId;
	}

	public void setInventoryItemId(Long inventoryItemId) {
		this.inventoryItemId = inventoryItemId;
	}

	public Long getOrderQuantity() {
		return orderQuantity;
	}

	public void setOrderQuantity(Long orderQuantity) {
		this.orderQuantity = orderQuantity;
	}

	public Long getUnitSellingPricae() {
		return unitSellingPricae;
	}

	public void setUnitSellingPricae(Long unitSellingPricae) {
		this.unitSellingPricae = unitSellingPricae;
	}

	public String getOrderQuantityUom() {
		return orderQuantityUom;
	}

	public void setOrderQuantityUom(String orderQuantityUom) {
		this.orderQuantityUom = orderQuantityUom;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Long getCompanyId() {
		return companyId;
	}

	public void setCompanyId(Long companyId) {
		this.companyId = companyId;
	}

	public static String getFieldOrderslineId() {
		return FIELD_ORDERSlINE_ID;
	}
	
	
	
	
}
