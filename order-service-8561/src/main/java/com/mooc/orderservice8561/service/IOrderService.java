package com.mooc.orderservice8561.service;

import com.mooc.orderservice8561.hystrix.FeignServiceFactoryHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "${service.name}",fallbackFactory = FeignServiceFactoryHystrix.class)
@Component
public interface IOrderService  {

    @RequestMapping(value = "/compute/{a}/{b}",method = {RequestMethod.GET,RequestMethod.POST})
    String compute(@PathVariable("a") String a,@PathVariable("b")String b);
}
