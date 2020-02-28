package com.epam.interest;

public class Compound_Interest extends Interest {
    public Compound_Interest(int p,int r,int t) {
        super(p,r,t);
    }
    public void CI()
    {
        double CI=principal*Math.pow((1+rate/100.0),time);
        System.out.format("%s","Compound Interest=="+CI);
    }
}
