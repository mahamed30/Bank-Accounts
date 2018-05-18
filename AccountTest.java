import java.util.*;

public class AccountTest
{
   public static void main(String[] args)
   {
      Scanner kbd = new Scanner(System.in);
      Account acc1 = new Account();
      
      int amount, n=6, count=0;
      float low, high, avg, sum=0;
      float[] arr = new float[n];
      
      System.out.println("Welcome");
      System.out.println("");
      
      for(int i=0; i<n; i++)
      {
         System.out.print("Enter the amount for account number "+(i+1)+ ": ");
         
         amount = kbd.nextInt();
         arr[i] = (float)acc1.interest(amount);
         System.out.println("The interest for account number "+(i+1)+ " is "+arr[i]);
         System.out.println("");
         
      }
      
      low=high=arr[0];
      
      for(int i=0; i<n; i++)
      {
         if(low>arr[i])
            low=arr[i];
         if(high<arr[i])
            high=arr[i];
         
         sum=sum+arr[i];
         
         if(acc1.interestType((int)arr[i])==1)
            count++;
      }
      
      System.out.println("---------------------------------------- Interest Details ----------------------------------------");
      System.out.println("");
      System.out.println("Total Interest: $"+sum);
      System.out.println("Lowest Interest: $"+low);
      System.out.println("Highest Interest: $"+high);
      
      avg=sum/n;
      
      System.out.println("Average Interest: $"+avg);
      System.out.println("Number of accounts with no Interest: "+count);
      System.out.println("");
      System.out.println("---------------------------------------- Thanks! ----------------------------------------");
   }
}