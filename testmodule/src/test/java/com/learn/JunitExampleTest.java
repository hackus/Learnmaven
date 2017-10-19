package com.learn;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class JunitExampleTest {
    int n = 10;

    @Test
    public void testSumMyLib(){
        MyLib lib = new MyLib();

        assertTrue(lib.sum(n) == sum(n));
    }

    public long sum(int n){
        int sum = 0;
        for(int i=0;i<n;i++){
            sum+=i;
        }
        return sum;
    }
}
