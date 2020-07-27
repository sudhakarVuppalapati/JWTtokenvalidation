package com.cvc.test;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloWorldController {

@RequestMapping({ "/hello" })
public String firstPage() {
    System.out.println("firstPage qqqq ");
    return "Hello World";
}
    @RequestMapping(value = "/posttest", method = RequestMethod.POST)
    public ResponseEntity<?> createAuthenticationToken(@RequestBody JwtRequest authenticationRequest) throws Exception {

        System.out.println("createAuthenticationToken    test  ");
        return ResponseEntity.ok(new String("Tests the post JSON Object"));

    }



}