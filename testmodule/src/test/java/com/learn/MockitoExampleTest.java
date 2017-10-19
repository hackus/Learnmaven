package com.learn;

import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class MockitoExampleTest {
    @Test
    public void testSubstract(){
        MyLib test = mock(MyLib.class);
        int x = 5;
        int y=3;
        when(test.sum(5)).thenReturn(5l);
        when(test.sum(3)).thenReturn(2l);
        when(test.substract(5, 3)).thenCallRealMethod();

        long testSubstraction = test.substract(x,y);

        assertTrue(testSubstraction == 3);
    }
}
