package loops;
/*
Make a program that displays user-supplied name and age.
 */

import java.util.Scanner;

public class Ex1_NameAndAge {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String name;
        int age;

        //While solution
        while(true) {

            System.out.println("Type your name: ");
            name = scan.next();
            if(name.equals("0")) break;

            System.out.println("Type your age: ");
            age = scan.nextInt();
        }

       System.out.println("Come back here.");
       
    }
}
