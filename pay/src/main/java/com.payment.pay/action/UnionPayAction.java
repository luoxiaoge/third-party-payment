package com.payment.pay.action;

import com.alibaba.dubbo.config.annotation.Reference;
import com.payment.core.unionpay.service.UnionPayService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/union")
public class UnionPayAction {


    @Reference(version = "1.0.0",
            application = "${dubbo.application.id}",
            registry = "${dubbo.registry.id}")
    private UnionPayService unionPayService;

    @RequestMapping(value = "/pay")
    public ModelAndView pay(int orderId){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("form",unionPayService.unifiedOrder(orderId));
        modelAndView.setViewName("union/pay");
        return modelAndView;
    }
}
