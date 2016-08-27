package hcm.core.orders.dto;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "hap_org_companys")
public class Companys {
	public static final String FIELD_COMPANY_ID = "companyId";
	
	
	
	@Id
    @Column
    private Long companyId;

    @Column
    private String companyNumber;

    @Column
    private String companyName;

	public Long getCompanyId() {
		return companyId;
	}

	public void setCompanyId(Long companyId) {
		this.companyId = companyId;
	}

	

	public String getCompanyNumber() {
		return companyNumber;
	}

	public void setCompanyNumber(String companyNumber) {
		this.companyNumber = companyNumber;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public static String getFieldCompanyId() {
		return FIELD_COMPANY_ID;
	}

    
    
    
}
