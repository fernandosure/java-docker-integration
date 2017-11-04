package com.example;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.context.WebApplicationContext;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.webAppContextSetup;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
@WebAppConfiguration
public class ApplicationTests {

	@Autowired
	public WebApplicationContext webApplicationContext;
    public MockMvc mockMvc;

	@Before
	public void setup(){
        this.mockMvc = webAppContextSetup(webApplicationContext).build();
	}

    @Test
    public void testControllerReturnsHelloWorld() throws Exception {
        mockMvc.perform(get("/")).andExpect(content().string("Hello World JavaDay"));
    }


}
