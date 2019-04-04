package com.mooc.orderservice8561.hystrix;

import com.mooc.orderservice8561.service.IOrderService;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

@Component
public class FeignServiceFactoryHystrix implements FallbackFactory<IOrderService> {

    @Override
    public IOrderService create(Throwable throwable) {
        return (a, b) -> "feign发生error，返回-10001";
    }
}
