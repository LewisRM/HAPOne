package hcm.core.orders.dto;

import javax.persistence.Column;
import javax.persistence.Id;


public class Order {
	public static final String FIELD_ORDER_ID = "orderId";
	
	
	
	@Column
    private Long orderId;
	
	@Id
    @Column
    private Long companyId;

    @Column
    private Long customerId;


    @Column
    private String inventoryItemId;

    @Column
    private String orderNumber;
    
    @Column
    private String orderStatus;
    
    @Column
    private String companyName;
    
    @Column
    private String customerName;
    
    @Column
    private Long orderMoney;
    
    @Column
    private String orderDate;
    
    @Column
	private Long orderQuantity;
	
	@Column
	private Long unitSellingPricae;
    
    

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

	public String getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}

	public Long getCompanyId() {
		return companyId;
	}

	public void setCompanyId(Long companyId) {
		this.companyId = companyId;
	}

	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

	public String getInventoryItemId() {
		return inventoryItemId;
	}

	public void setInventoryItemId(String inventoryItemId) {
		this.inventoryItemId = inventoryItemId;
	}



	public String getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}

	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public Long getOrderMoney() {
		return orderMoney;
	}

	public void setOrderMoney(Long orderMoney) {
		this.orderMoney = orderMoney;
	}

	/*public void setOrderMoney(Long unitSellingPricae, Long orderQuantity) {
		this.orderMoney = unitSellingPricae*orderQuantity;
	}*/
    
    
    
    

	

	
    
    
    
}
