package House;

public class Cost_Of_House {
    private int type;
    private  double area;
    public  Cost_Of_House(int type,double cost) {
        this.type=type;
        this.area=cost;
    }
   public int  CostPerItem(int type)
   {  int cost=0;
       if(type==1)
           cost=1200;
       else
           if(type==2)
               cost=1500;
           else
               if(type==3)
                   cost=1800;
               else
                   if(type==4)
                       cost=2500;
                   return  cost;
   }
   public void CalCost()
   {
       double FinalPrice= this.area * CostPerItem(this.type);
       System.out.format("%s","Final Price==="+FinalPrice);

   }
}
