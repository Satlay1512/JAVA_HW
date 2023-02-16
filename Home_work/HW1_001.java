// Вычислить n-ое треугольного число(сумма чисел от 1 до n), 
// n! (произведение чисел от 1 до n)
package Seminars.Home_work;

import java.util.Scanner;

public class HW1_001 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number:  ");
        int a = Scanner.nextInt();
        Scanner.close();
        System.out.println("Triangular number = " + Triangle(a) + "\n");
        
    }

    private static int Triangle(int num) {
        if (num == 1){
            return 1;
        }
        return Triangle(num - 1) + num;
    }
}
