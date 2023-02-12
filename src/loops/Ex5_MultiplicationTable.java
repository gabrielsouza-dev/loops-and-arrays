package loops;

import java.util.Scanner;

public class Ex5_MultiplicationTable {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Desired multiplication table: ");
        int table = scan.nextInt();

        System.out.println("Table of: " + table);

        for(int i = 1; i <= 10; i++) {
            System.out.println(table + " x " + i + " = " + (table * i));
        }
    }
}
