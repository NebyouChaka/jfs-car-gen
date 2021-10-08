package com.example.car_gen;
import org.junit.Assert;

import com.example.car_gen.Honda;
import  org.junit.Test;
import org.junit.Test;

public class CarTest {
    Honda civic = new Honda("black", 2021, 180, true);


    @Test
    public void testAcceleratedSpeed() {
    Assert.assertEquals(5, civic.acceleratedSpeed());

    }
}
