class ForDemoExamples
{
   public static void main(String...args)
   {
 
       /*for(int i=1;i<=10;i++)
          System.out.println(i);*/

        /*for(int i=1;i<=10;i++)
          System.out.print(i);*/

        /* for(int i=1;i<=10;i++)
           System.out.print(i*10);*/

       /* for(int i=10;i<=100;i+=10)
          System.out.print(i);*/


          /*for(int i=1;i<=10;i++)
             System.out.print(1);*/

         /*for(int i=2;i<=100;i+=2)
           System.out.println(i);*/

           /* for(int i=1;i<=10;i++)
          {
             for(int j=1;j<=10;j++)
             {
              System.out.print(i);
             }
              System.out.println();
          }*/


         /* for(int i=1;i<=10;i++)
          {
             for(int j=1;j<=10;j++)
             {
              System.out.print(j);
             }
               System.out.println();

          }*/



          /*for(int i=1;i<=10;i++)
             System.out.println(5 +" * " + i + " = " + (5 * i));*/

      
       /*for(int j=1;j<=10;j++)
       {
         for(int i=1;i<=10;i++)
             System.out.println( j +" * " + i + " = " + ( j * i));
       }*/

      /* int cntr=1;

       for(int i=1;i<=10;i++)
       {
          for(int j=1;j<=10;j++)
          {
            System.out.print(cntr++);
                          
          }
          System.out.println();
       }*/


       /*int val=10;

       for(int i=1;i<=3;i++)
       {
           for(int j=1;j<=3;j++)
           {
              System.out.print(val);
              val+=10;
           }
           System.out.println();
       } */

       /* int cntr=1;

        for(int i=1;i<=4;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(cntr++);
            }
             System.out.println();
        }*/

       /*int cntr=1;

        for(int i=1;i<=4;i++)
        {
            for(int k=1;k<=4-i;k++)
               System.out.print(" ");

            for(int j=1;j<=i;j++)
            {
                System.out.print(cntr++);
            }
             System.out.println();
        }*/

        /*int cntr=1;

        for(int i=1;i<=4;i++)
        {
            for(int k=1;k<=4-i;k++)
               System.out.print(" ");

            for(int j=1;j<=i;j++)
            {
                System.out.print(cntr++ + " ");
            }
             System.out.println();
        }*/


         /*for(int i=1;i<=5;i++)
         {
            for(int j=1;j<=5;j++)
            {
               if(i==j)
                 System.out.print(i);
                else
                System.out.print(" ");
            }
              System.out.println();
         }*/

         /*for(int i=1;i<=5;i++)
         {
            for(int j=1;j<=5;j++)
            {
               if(i==j)
                 System.out.print(1);
                else
                System.out.print(" ");
            }
              System.out.println();
         }*/


         /*for(int i=1;i<=5;i++)
         {
            for(int j=1;j<=5;j++)
            {
              if(i==j||i+j==6)
                System.out.print(i);
              else
                System.out.print(" ");
            }
              System.out.println();
         }*/

        /* for(int i=1;i<=5;i++)
         {
            for(int j=1;j<=5;j++)
            {
              if(i==j||i+j==6)
                System.out.print(j);
              else
                System.out.print(" ");
            }
              System.out.println();
         }*/

        /*String str="RAJNI";
 
  
        for(int i=0;i<str.length();i++)
        {
           for(int j=0;j<str.length();j++)
           { 
             if(i==j||i+j==4)
               System.out.print(str.charAt(i));
             else
               System.out.print(" ");
           }
             System.out.println();

         } */


         String str="RAJNI";


        for(int i=0;i<str.length();i++)
        {
            for(int j=0;j<=i;j++)
            {
              System.out.print(str.charAt(j));
              
            }
                System.out.println();

         }

































     







    





 






















         






   }


}