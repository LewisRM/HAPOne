package hcm.core.orders.controllers;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hand.hap.core.IRequest;
import com.hand.hap.system.controllers.BaseController;
import com.hand.hap.system.dto.ResponseData;

import hcm.core.orders.dto.OrderHeader;
import hcm.core.orders.service.IOrderHeaderService;

@Controller
public class OrderHeaderController  extends BaseController{

    @Autowired
    private IOrderHeaderService orderHeaderService;

  
    @RequestMapping(value = "/orders/order/insert")
    @ResponseBody
    public ResponseData submit(HttpServletRequest request, @RequestBody List<OrderHeader> orderHeaders) {
        IRequest iRequest = createRequestContext(request);
        for(OrderHeader orderHeader:orderHeaders){
        	 orderHeaderService.insert(iRequest, orderHeader);
        }
        return new ResponseData(orderHeaders);
    }

   
}
