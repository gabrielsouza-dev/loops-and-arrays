package loops;

import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int grade;

        System.out.println("Type a grade: ");
        grade = scan.nextInt();

        while(grade < 0 | grade > 10) {
            System.out.println("Invalid grade! Please re-enter: ");
            grade = scan.nextInt();
        }
    }
}
