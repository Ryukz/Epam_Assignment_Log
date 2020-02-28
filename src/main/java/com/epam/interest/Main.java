package com.epam.interest;

import java.io.IOException;
import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class Main {
   private static final Logger logger = LogManager.getLogger(Main.class);

    static
    {    logger.info("Enter the principal ,rate and time111 ");
        try {
            System.out.write("Enter the principal ,rate and time ".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
        Scanner n=new Scanner(System.in);
        int p=n.nextInt();
        int r=n.nextInt();
        int t=n.nextInt();
        System.out.format("%s","Enter your choice 1 for SI or 2 for CI");
        int ch=n.nextInt();

        if(ch==1)
        {   logger.info("\nThe Result Is(Simple Interest) :\n");
            Simple_Interest simple_interest=new Simple_Interest(p,r,t);
        simple_interest.CAl_SI();
        }
        else
            if(ch==2)
            {   logger.info("\nThe Result Is(Compound Interest) :\n");
              Compound_Interest compound_interest =new Compound_Interest(p,r,t);
              compound_interest.CI();
            }
            //n.close();
    }
    public  static void main(String args[])
    {
        // Can't use the main method as per the question
    }
}
