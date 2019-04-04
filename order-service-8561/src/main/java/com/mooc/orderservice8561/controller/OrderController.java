package com.mooc.orderservice8561.controller;

import com.mooc.orderservice8561.service.IOrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
@Slf4j
public class OrderController {

    @Autowired
    private IOrderService orderService;

    @RequestMapping("/compute/{a}/{b}")
    public String compute(@PathVariable("a") String a,@PathVariable("b") String b){
        log.info("feign compute:{},{}",a,b);
        return orderService.compute(a,b);
    }


}
