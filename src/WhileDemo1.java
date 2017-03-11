import java.util.Scanner;

class WhileDemo1
{
   public static void main(String...args)
   {
     Scanner sc=new Scanner(System.in);
     
      String ans="";
      char ch='n';

      while(ch!='y')
      {
            System.out.println("Will you listen to me?");
            ans=sc.nextLine();
            ch=ans.charAt(0);
      }
      

   
   }

}