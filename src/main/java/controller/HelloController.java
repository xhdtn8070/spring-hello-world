package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import service.HelloService;

@Controller
public class HelloController {
    private HelloService helloService;

    @Autowired
    public void setHelloService(HelloService helloService) {
        this.helloService = helloService;
    }

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String helloWorld() {
        helloService.printHello();
        return "home";
    }
}
