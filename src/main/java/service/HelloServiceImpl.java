package service;

import org.springframework.stereotype.Service;

@Service
public class HelloServiceImpl implements HelloService {
    @Override
    public void printHello() {
        System.out.println("Hello!");
    }
}
