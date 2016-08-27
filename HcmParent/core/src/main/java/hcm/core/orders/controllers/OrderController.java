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

import hcm.core.orders.dto.Order;
import hcm.core.orders.service.IOrderService;

/**
 * 订单查询控制器.
 * 
 * @author LiChangjiang
 */
@Controller
public class OrderController extends BaseController {

    @Autowired
    private IOrderService orderService;
    
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
    @RequestMapping(value = "/orders/order/query")
    @ResponseBody
    public ResponseData getOrders(Order order,@RequestParam(defaultValue = DEFAULT_PAGE) int page,
            @RequestParam(defaultValue = DEFAULT_PAGE_SIZE) int pagesize, HttpServletRequest request) {
        IRequest requestContext = createRequestContext(request);
        return new ResponseData(orderService.selectAllOrders(requestContext, order, page, pagesize));
    }
    
    
    
    /*@RequestMapping(value = "/orders/order/insert")
    @ResponseBody
    public ResponseData insertOrders(OrderHeader orderHeader,@RequestParam(defaultValue = DEFAULT_PAGE) int page,
            @RequestParam(defaultValue = DEFAULT_PAGE_SIZE) int pagesize, HttpServletRequest request) {
        IRequest requestContext = createRequestContext(request);
        
        System.out.println(orderHeader);
        orderService.insertOrderHeader(orderHeader);
        
        return new ResponseData(orderService.selectAllOrders(requestContext, orderHeaders, page, pagesize));
        return new ResponseData();
    }*/
    
}
