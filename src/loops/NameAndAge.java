package loops;

import java.util.Scanner;

public class NameAndAge {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String name;
        int age;

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
