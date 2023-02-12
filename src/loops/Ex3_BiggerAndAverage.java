package loops;

import java.util.Scanner;

public class Ex3_BiggerAndAverage {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int bigger = 0;
        int number;
        int counter = 0;
        int sum = 0;

        do {
            System.out.println("Type a number: ");
            number = scan.nextInt();

            sum = sum + number;

            if(number > bigger) bigger = number;

            counter++;
        } while(counter < 5);

        System.out.println("Bigger: " + bigger);
        System.out.println("Average: " + (sum/5));
    }
}
