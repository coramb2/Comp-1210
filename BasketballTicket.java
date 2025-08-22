import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.Random;
/** 
* A program that accepts coded ticket information as input.
* 
* Project 3 
* @author Cora Baldwin 
* @version February 4, 2022 
*/
public class BasketballTicket {
/** 
* Outputs the price, discount, time, date, section, 
* row, seat, and ticket description.
* @param args Command line arguments 
*/
   public static void main(String[] args) {
      // Initializes Scanner and random
      Scanner userInput = new Scanner(System.in);
      Random random = new Random();
      // Variables
      String ticketCode = "", time = "", date = "";
      String section = "", row = "", seat = "", ticketDescription = "";
      Double price = 0.0, discount = 0.0;
      int prizeNum = 0;
      // Decimal Format
      DecimalFormat money = new DecimalFormat("$#,##0.00");
      DecimalFormat discountDF = new DecimalFormat("0%");
      DecimalFormat prizeDF = new DecimalFormat("000000");
      // take input
      System.out.print("Enter ticket code: ");
      ticketCode = userInput.nextLine();
      ticketCode = ticketCode.trim();
      // for less than 28 characters
      if (ticketCode.length() < 28) {
         System.out.print("\n*** Invalid Ticket Code ***");
         System.out.print("\nTicket code must have at least 28 characters.\n");
      }
      else {
         // Price
         price = Double.parseDouble(ticketCode.substring(0, 4) + ".");
         price = Double.parseDouble(price + ticketCode.substring(4, 6));
         // Discount
         discount = Double.parseDouble(ticketCode.substring(6, 8));
         discount = discount / 100;
         // Cost
         Double cost = price - (discount * price);
         // Time
         time = ticketCode.substring(8, 10) + ":";
         time = time + ticketCode.substring(10, 12);
         //Date
         date = ticketCode.substring(12, 14);
         date = date + "/" + ticketCode.substring(14, 16);
         date = date + "/" + ticketCode.substring(16, 20);
         // Section
         section = ticketCode.substring(20, 23);
         // Row
         row = ticketCode.substring(23, 25);
         // Seat
         seat = ticketCode.substring(25, 27);
         // Ticket description
         ticketDescription = ticketCode.substring(27, ticketCode.length());
         // Prize number
         prizeNum = random.nextInt(1000000);
         
         // Output
         System.out.print("\nTicket: " + ticketDescription);
         System.out.print("\nDate: " + date + "   Time: " + time);
         System.out.print("\nSection: " + section + "   Row: " 
            + row + "   Seat: " + seat);
         System.out.print("\nPrice: " + money.format(price) + "   Discount: " 
            + discountDF.format(discount) + "   Cost: " + money.format(cost));
         System.out.println("\nPrize Number: " + prizeDF.format(prizeNum));
      }
      
   }
}