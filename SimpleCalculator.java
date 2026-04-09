import java.util.*;
import java.util.Scanner;
public class SimpleCalculator {
    public static void main(String[] args) {
      //create a variable two enter two values
      //perfrom operations
      //display results
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter two numbers");
      double a = sc.nextDouble();
      double b = sc.nextDouble();
      System.out.println("sum is "+(a+b));
      sc.close();
    }
}


