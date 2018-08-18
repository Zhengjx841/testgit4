package com.glen.he;

import com.glen.he.SimpleCalculation;

import static org.junit.Assert.*;
import org.junit.Test;

public class SimpleCalculationTest {

    SimpleCalculation sc = new SimpleCalculation();
    
    @Test
    public void AddTest() {
        
        int c = sc.Add(3, 5);    
        
        assertEquals(8, c);        
    }
}

