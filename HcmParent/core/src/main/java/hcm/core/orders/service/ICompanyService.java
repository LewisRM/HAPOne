package hcm.core.orders.service;

import java.util.List;

import com.hand.hap.core.IRequest;
import com.hand.hap.core.ProxySelf;
import com.hand.hap.system.service.IBaseService;

import hcm.core.orders.dto.Companys;

public interface ICompanyService extends IBaseService<Companys>, ProxySelf<ICompanyService> {
    
	    List<Companys> selectAllCompanys(IRequest requestContext,Companys company, int page, int pagesize);
	}


