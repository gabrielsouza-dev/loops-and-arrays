package arrays;
/*
Make a program that reads a 6-character vector and says how many consonants were read, finally print the consonants.
 */

import java.util.Scanner;

public class Ex2_Consonants {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] consonants = new String[6];
        int quantityConsonants = 0;
        int counter = 0;

        do {
            System.out.println("Type a letter: ");
            String letter = scan.next();

            if(!(letter.equalsIgnoreCase("a") |
                 letter.equalsIgnoreCase("e") |
                 letter.equalsIgnoreCase("i") |
                 letter.equalsIgnoreCase("o") |
                 letter.equalsIgnoreCase("u") )) {
                    consonants[counter] = letter;
                    quantityConsonants++;
                 }

            counter++;

        } while(counter < consonants.length);

        System.out.print("Consonants: ");
        for (String consonant : consonants) {
            if(consonant != null)
            System.out.print(consonant + " ");
        }
        System.out.println("Quantity of consonants: " + quantityConsonants);
        System.out.println(consonants.length);
    }
}
