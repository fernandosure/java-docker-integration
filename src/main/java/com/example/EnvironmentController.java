package com.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by fernando on 8/07/16.
 */

@RestController
public class EnvironmentController {
    @Value("${example.database_url}")
    private String databaseUrl;

    @RequestMapping(value="/database_url")
    public String GetDatabaseUrl(){
        return databaseUrl;
    }

}
