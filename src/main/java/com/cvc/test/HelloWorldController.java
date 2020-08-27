package com.cvc.test;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloWorldController {


 @Autowired
 private IAuthenticationFacade authenticationFacade;
 @Autowired
 AuthenticationManager authenticationManager;
@RequestMapping({ "/hello" }) //HttpServletRequest request
public String firstPage(java.security.Principal user) {
    System.out.println("firstPage qqqq "+ user.getName());
    Authentication authentication = authenticationFacade.getAuthentication();


    System.out.println("    authentication.getAuthorities : "+           authentication.getName());
    return "Hello World! to : " + authentication.getAuthorities()+"   authentication.getAuthorities:  "+       authentication.getName();
}
    @RequestMapping(value = "/posttest", method = RequestMethod.POST)
    public ResponseEntity<?> createAuthenticationToken(@RequestBody JwtRequest authenticationRequest) throws Exception {

        System.out.println("createAuthenticationToken    test  ");
        return ResponseEntity.ok(new String("Tests the post JSON Object"));

    }



}