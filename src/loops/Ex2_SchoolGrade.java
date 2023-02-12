package loops;
/*
Make a program that reads a school grade from 0 to 10 and indicates if the grade is invalid with a message.
 */
import java.util.Scanner;

public class Ex2_SchoolGrade {
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
