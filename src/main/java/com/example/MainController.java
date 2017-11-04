package com.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by fernando on 7/07/16.
 */
@RestController
public class MainController {

    @RequestMapping(value="/")
    public String HelloWorld(){
        return "Hello World JavaDay";
    }

}
