// Реализовать простой калькулятор Введите число 2 Введите операцию 
// 1 + 2 - 3 * 4 / Введите число 2 2 + 2 = 4
package Seminars.Home_work;
import java.util.Scanner;
public class HW1_003 {
   public static void main(String[] args) {
      double num1;
      double num2;
      double ans;
      char op;
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter two numbers: ");
      num1 = sc.nextDouble();
      num2 = sc.nextDouble();
      System.out.print("\nEnter an operator (+, -, *, /): ");
      op = sc.next().charAt(0);
      switch(op) {
         case '+': ans = num1 + num2;
            break;
         case '-': ans = num1 - num2;
            break;
         case '*': ans = num1 * num2;
            break;
         case '/': ans = num1 / num2;
            break;
         default:  System.out.printf("Error! Enter correct operator");
            return;
      }
      System.out.print("\nThe result is given as follows:\n");
      System.out.printf(num1 + " " + op + " " + num2 + " = " + ans);
   }
}