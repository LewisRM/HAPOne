package hcm.core.orders.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.hand.hap.core.annotation.Children;
import com.hand.hap.system.dto.BaseDTO;

@Table(name = "hap_om_order_headers")
public class OrderHeader extends BaseDTO {
public static final String FIELD_ORDER_HEADER_ID = "headerId";
	
	
	
	@Id
    @Column
    private Long headerId;

    @Column
    private String orderNumber;
    
    @Column
    private Long customerId;
    
    @Column
    private Long companyId;

    @Column
    private String orderStatus;
    
    @Column
    private Date orderDate;
    
    @Transient
    @Children
    private OrderLine orderline;
    
    
    
    
	public OrderLine getOrderline() {
		return orderline;
	}

	public void setOrderline(OrderLine orderline) {
		this.orderline = orderline;
	}

	public Long getHeaderId() {
		return headerId;
	}

	public void setHeaderId(Long headerId) {
		this.headerId = headerId;
	}

	public String getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}

	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

	public Long getCompanyId() {
		return companyId;
	}

	public void setCompanyId(Long companyId) {
		this.companyId = companyId;
	}

	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public static String getFieldOrderHeaderId() {
		return FIELD_ORDER_HEADER_ID;
	}
    
    
}
