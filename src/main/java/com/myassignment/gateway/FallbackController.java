package com.myassignment.gateway;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class FallbackController {

    @RequestMapping("/serviceReceiverFallback")
    public Mono<String> serviceReceiverFallback() {
        return Mono.just(
            "Service Receiver is taking too long to respond or is down. Please try again after some time.");
    }

    @RequestMapping("/serviceProviderFallback")
    public Mono<String> serviceProviderFallback() {
        return Mono.just(
            "Service Provider is taking too long to respond or is down. Please try again after some time.");
    }


}
