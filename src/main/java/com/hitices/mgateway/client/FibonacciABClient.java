package com.hitices.mgateway.client;

import com.hitices.common.bean.MResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "FibonacciAB")
public interface FibonacciABClient {
    @RequestMapping(value = "/fibonaccia", method = RequestMethod.POST)
    MResponse fibonacci1(@RequestParam(value = "n") Integer n);

    @RequestMapping(value = "/fibonaccib", method = RequestMethod.POST)
    MResponse fibonacci2(@RequestBody MResponse response);
}
