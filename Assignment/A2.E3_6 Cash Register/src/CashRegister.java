/**
   A cash register totals up sales, computes change due & Prints a Receipt with Total.
*/
public class CashRegister
{
   private double taxRate;
   private double purchase;
   private double taxablePurchase;
   private double payment;   
   private String receiptText; 
   private int count;

   /**
      Constructs a cash register with no money in it.
      @param rate the tax rate for taxable purchases
   */
   public CashRegister(double rate)
   {
      taxRate = rate;
      purchase = 0;
      payment = 0;      
      receiptText="";
      count =0;
   }

   /**
      Records the sale of a tax-free item & also feeds into generate Receipt
      @param amount the price of the item
   */
   public void recordPurchase(double amount)
   {
	  getReceipt(amount); 
      purchase = purchase + amount;
   }

   /**
      Records the sale of a taxable item.
      @param amount the price of the item
   */
   public void recordTaxablePurchase(double amount)
   {
	  taxablePurchase = taxablePurchase + amount;
   }

   /**
      Processes a payment received from the customer.
      @param amount the amount of the payment
   */
   public void receivePayment(double amount)
   {
      payment = payment + amount;
   }

   /**
      Processes the sales tax due.
      @return the sales tax due
   */
   public double getSalesTax()
   {
      return taxablePurchase * taxRate / 100;
   }

   /**
      Computes the change due and resets the machine for the next customer.
      @return the change due to the customer
   */
   public double giveChange()
   {   
	  double change = payment - purchase;
      purchase = 0;
      payment = 0;
      //double change = payment - purchase; //
      return change;
   }
   

   /**
   Generates the receipt per item.
   @param amount the Item Price
    */
   
   public void getReceipt(double amount)
   {
	   count+=1;
	   receiptText= receiptText.concat("Item No " + count +". " + String.valueOf(amount) + "\n"); 	   
   }
   
   /**
   Processes the Receipt for Printing.
   @return receiptText Per Item Receipt with Total Amount Due.
   */
   
   public String printReceipt()
   {
	   receiptText= receiptText.concat("Total Amount." +purchase + "\n");
	   return receiptText;
   }
   
     
   
}
