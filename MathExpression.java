import java.util.Scanner;
import java.text.DecimalFormat;
/** 
* A program that solves for the result of a specific expression.
* 
* Project 3 
* @author Cora Baldwin 
* @version February 4, 2022 
*/

public class MathExpression {
/** 
* Asks for userInput and computes the result.
* @param args Command line arguments 
*/
   public static void main(String[] args) {
     // Initializes Scanner
      Scanner userInput = new Scanner(System.in);
      // Variables
      Double x = 0.0;
      Double result = 0.0;
      DecimalFormat df = new DecimalFormat("#,##0.0##");
      // Take input
      System.out.print("Enter a value for x: ");
      x = userInput.nextDouble();
      // Result
      result = 3 + 3 * x + 3 * Math.pow(x, 2) + 3 * Math.pow(x, 3);
      result = Math.abs(result + 3 * Math.pow(x, 4));
      result = Math.sqrt(result) + 3 * Math.pow(x, 5);
      result = result / (Math.abs(x) + 3);
      // Conversion
      String resultString = Double.toString(result);
      // Output
      System.out.println("Result: " + result);
      System.out.println("# of characters to left of decimal point: " 
         + resultString.indexOf("."));
      System.out.println("# of characters to right of decimal point: " 
         + (resultString.length() - (resultString.indexOf(".") + 1)));
      System.out.println("Formatted Result: " + df.format(result));
   }
}