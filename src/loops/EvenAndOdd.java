package loops;

import java.util.Scanner;

public class EvenAndOdd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int quantityNumbers;
        int counter = 0;
        int number;
        int quantityEven = 0;
        int quantityOdd = 0;

        System.out.println("Enter the number of numbers: ");
        quantityNumbers = scan.nextInt();

        do {
            System.out.println("Type a number: ");
            number = scan.nextInt();

            if(number % 2 == 0) quantityEven++;
            else quantityOdd++;

            counter++;
        } while(counter < quantityNumbers);

        System.out.println("Quantity of even: " + quantityEven);
        System.out.println("Quantity of odds: " + quantityOdd);
    }
}