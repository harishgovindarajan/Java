import java.util.*;
class pnr
{
    public static void main(String[] args)
    {
         try
         {
         double p;
         int n;
         double r,i;
         Scanner sc=new Scanner(System.in);
         System.out.print("Is the person is senior citizen(y/n): ");
         char g=sc.next().charAt(0);
         System.out.println("Enter the principal amount:"); 
         p=sc.nextDouble();
         System.out.println("Enter the no.of.years:"); 
         n=sc.nextInt();
         
         if(g=='y'||g=='Y')
         {
            r=12;
            i=p*n*r/100;
            System.out.println("Interest:"+i);
          
          }
         if(g=='n'||g=='N')
          {
            r=10;
            i=p*n*r/100;
            System.out.println("Interest:"+i); 
           }
         if(p<=0)
          {
             
            System.out.println("Enter the valid amount");
          }
         if(n<=0)
          {
             
            System.out.println("Enter the valid no.of.years");
          }
       }
       catch(Exception e)
        {
           System.out.println("Enter the amount");
         }
    }
}