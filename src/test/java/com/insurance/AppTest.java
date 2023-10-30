package com.insurance;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest

public class AppTest 
{
    
    @Test
	void contextLoads() {
         int result = 2 + 2;
        assertEquals(4, result);
	}

}
