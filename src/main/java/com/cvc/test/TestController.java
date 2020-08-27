package com.cvc.test;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TestController {

@RequestMapping({ "/test" })
public String firstPage() {
    System.out.println("firstPage TestController::test ");
    return "Hello World  test";
}
}