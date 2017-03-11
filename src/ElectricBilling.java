import java.util.Scanner;

class ElectricBilling
{
    public static void main(String...args)
   {
       Scanner input=new Scanner(System.in);
       System.out.println("Enter the units Consumed");
       int units=input.nextInt();

       System.out.println("Enter the arrears if any else 0");
       int arrears=input.nextInt();

       double amt=0.0;
       double disc=0.0;
       double fineamt=0.0;

       if(units>=0 && units<=50)
          amt=units*1.20;
       else if(units>50 && units<=100)
          amt=(50*1.20)+(units-50)*2.40;
       else if(units>100 && units<=150)
           amt=(50*1.20)+(50*2.40)+(units-100)*3.60;
       else if(units>150)
       {
           amt=(50*1.20)+(50*2.40)+(50*3.60)+(units-150)*4.80;
           if(units>200)
              disc=amt*5.0/100.0;
           
           if(disc>200)
              disc=200;  

        }


        if(arrears>0)
         fineamt= arrears*(10.0/100.0);          

 
        double totalamt=amt+ arrears+fineamt-disc;

         System.out.println("The total amount payable: " + totalamt);

           









   }



}