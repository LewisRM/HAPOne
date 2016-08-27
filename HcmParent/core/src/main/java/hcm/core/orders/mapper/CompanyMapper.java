package hcm.core.orders.mapper;

import java.util.List;

import com.hand.hap.mybatis.common.Mapper;

import hcm.core.orders.dto.Companys;

public interface CompanyMapper extends Mapper<Companys> {
	List<Companys> selectAllCompanys(Companys company);
}
