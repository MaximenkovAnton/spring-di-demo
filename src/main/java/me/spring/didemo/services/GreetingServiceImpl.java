package me.spring.didemo.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService {

    private static final String hello = "Hello!!!";

    @Override
    public String SayHello() {
        return hello;
    }
}
