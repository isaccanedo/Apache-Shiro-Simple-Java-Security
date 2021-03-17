package com.isac.comparison.springsecurity;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.isac.comparison.springsecurity.Application;

@ExtendWith(SpringExtension.class)
@SpringBootTest(classes = { Application.class })
public class SpringContextTest {

    @Test
    public void whenSpringContextIsBootstrapped_thenNoExceptions() {

    }

}