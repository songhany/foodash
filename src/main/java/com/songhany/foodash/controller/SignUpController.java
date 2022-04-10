package com.songhany.foodash.controller;

import com.songhany.foodash.entity.Customer;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;

@Controller  // Use @Controller to mark a class its role as a web component, so the spring mvc will register the methods which annotated the @RequestMapping.
public class SignUpController {
    @RequestMapping(value = "/signup", method = RequestMethod.POST)
    @ResponseStatus(value = HttpStatus.CREATED)
    public void signUp(@RequestBody Customer customer) {
        //
    }
}


