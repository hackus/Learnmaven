package com.learn;

public class MyLib {
    private int i;

    public long sum(int n){
        long sum = 0;
        for(int i=0;i<n;i++){
            sum+=i;
        }
        return sum;
    }

    private long product(int n){
        int prod = 0;
        for(int i=0;i<n;i++){
            prod+=i;
        }
        return prod;
    }

    public long substract(int x, int y){
        return sum(x) - sum(y);
    }

    public long combine(int n){
        return sum(n) + product(n);
    }
}
