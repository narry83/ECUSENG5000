/**
   A class to test the CashRegister class.
*/
public class CashRegisterTester
{
   public static void main(String[] args)
   {
      CashRegister register = new CashRegister(10);

      register.recordPurchase(29.50);
      register.recordPurchase(9.25);
      register.receivePayment(50);
          
     //Generates a Item wise Receipt with Total Amount Due at the end
      String receiptText=register.printReceipt();
      System.out.println(receiptText);
      
      //Generates the remaining Change
      double change = register.giveChange();
      System.out.println("Actual Change:"+change);      
      System.out.println("Expected Change: 11.25");
    		  
   }
}
