import java.util.Scanner;

class TrafficSignal
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the Traffic color");
        
        String color=input.nextLine();
               color=color.toLowerCase();

        switch(color)
        {
           case "red":
                    System.out.println("Stop!");
                    break;
  
           case "yellow":
           case "orange":
           case "amber":
                       System.out.println("Caution!");
                       break;

          case "green":
                    System.out.println("Proceed");
                    break;
         default:
                   System.out.println("Invalid color");

       }
    }
}