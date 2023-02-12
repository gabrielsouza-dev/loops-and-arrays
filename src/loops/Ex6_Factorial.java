package loops;
/*
Write a program that calculates the factorial of a user-supplied integer.
Ex. : 8! = 40.320 (8 X 7 X 6 X 5 X 4 X 3 X 2 X 1)
 */

import java.util.Scanner;

public class Ex6_Factorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int factorial;
        int multiplication = 1;

        System.out.println("Enter the number to be factored: ");
        factorial = scan.nextInt();

        System.out.print(factorial + "! = ");
        for(int i = factorial; i >= 1; i--) {
            multiplication = multiplication * i;
        }
        
        System.out.println(multiplication);
        
    }
}
