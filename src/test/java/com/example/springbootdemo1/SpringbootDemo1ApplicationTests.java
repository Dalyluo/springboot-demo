package com.example.springbootdemo1;

import com.example.springbootdemo1.service.impl.CalcServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootDemo1ApplicationTests {

    @Test
    public void contextLoads() {
        CalcServiceImpl calc = new CalcServiceImpl();
        calc.decrement(10);
        calc.increment(10);
    }

}
