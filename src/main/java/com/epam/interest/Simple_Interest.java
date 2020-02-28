package com.epam.interest;

public class Simple_Interest extends Interest {
  Simple_Interest(int p,int r,int t)
  {
      super(p,r,t);
  }

       public void CAl_SI()
       {
           double SI=(principal*rate*time)/100;
          System.out.format("%s","Simple Interest =="+SI);
       }
}
