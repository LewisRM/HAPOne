package hcm.core.orders.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hand.hap.core.IRequest;
import com.hand.hap.system.controllers.BaseController;
import com.hand.hap.system.dto.ResponseData;

import hcm.core.orders.dto.Customers;
import hcm.core.orders.service.ICustomerService;

/**
 * 客户控制器.
 * 
 * @author LiChangjiang
 */
@Controller
public class CustomerController extends BaseController {

    @Autowired
    private ICustomerService customerService;
    
    /**
     * 任务分配查询.
     * 
     * @param fruit
     *            分配对象
     * @param page
     *            起始页
     * @param pagesize
     *            分页大小
     * @param request
     *            HttpServletRequest
     * @return ResponseData
     */
    @RequestMapping(value = "/orders/customer/query")
    @ResponseBody
    public ResponseData getTasks(Customers customer,@RequestParam(defaultValue = DEFAULT_PAGE) int page,
            @RequestParam(defaultValue = DEFAULT_PAGE_SIZE) int pagesize, HttpServletRequest request) {
        IRequest requestContext = createRequestContext(request);
        return new ResponseData(customerService.selectAllCustomers(requestContext, customer, page, pagesize));
    }
    
}
