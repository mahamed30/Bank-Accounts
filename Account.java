public class Account
{
   private double account_interest;
   
   public Account()
   {
      account_interest=0;  
   }
   public double interest(int amount)
   {
      if(amount<=1000)
         account_interest=amount*(0/100);
      else if(amount>1000 || amount<=5000)
         account_interest=amount*(2.5/100);
      else if(amount>5000 || amount<=10000)
         account_interest=amount*(5/100); 
      else
         account_interest=amount*(8/100);  
      
      return account_interest;      
   }
   public int interestType(int intrst)
   {
      if(intrst==0)
         return 1;
         
      return 0;
         
   }
}