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

import hcm.core.orders.dto.OrderLine;
import hcm.core.orders.service.IOrderLineService;


@Controller
public class OrderLineController  extends BaseController{

    @Autowired
    private IOrderLineService orderLineService;

  
    @RequestMapping(value = "/orders/orderLine/save")
    @ResponseBody
    public ResponseData submit(HttpServletRequest request, @RequestBody List<OrderLine> orderLines) {
        IRequest iRequest = createRequestContext(request);
        List<OrderLine> datas = orderLineService.batchUpdate(iRequest, orderLines);
        return new ResponseData(datas);
    }

   
}
