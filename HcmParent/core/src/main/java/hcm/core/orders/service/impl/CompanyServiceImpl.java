package hcm.core.orders.service.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.hand.hap.core.IRequest;
import com.hand.hap.system.service.impl.BaseServiceImpl;

import hcm.core.orders.dto.Companys;
import hcm.core.orders.mapper.CompanyMapper;
import hcm.core.orders.service.ICompanyService;

@Service
public class CompanyServiceImpl extends BaseServiceImpl<Companys> implements ICompanyService {

	 @Autowired
	    private CompanyMapper companyMapper;

		@Override
		public List<Companys> selectAllCompanys(IRequest requestContext,Companys company, int page, int pagesize) {
			// TODO Auto-generated method stub
			PageHelper.startPage(page, pagesize);
			return companyMapper.selectAllCompanys(company);
		}

}
