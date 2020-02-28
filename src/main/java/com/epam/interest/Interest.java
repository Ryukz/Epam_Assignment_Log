package com.epam.interest;

public class Interest {
    protected   int principal;
   protected   int rate;
   protected   int time;

    public Interest(int principal, int rate, int time) {
        this.principal = principal;
        this.rate = rate;
        this.time = time;
    }
}
