package arrays;
/*
Create a vector of 6 integers and print them in reverse order.
 */
public class Ex1_ReverseOrder {
    public static void main(String[] args) {
        
        int[] vector = {-5, 0, 15, 50, 8, 4};
        int counter = 0;

        System.out.print("Vetor: ");

        //print in normal order
        while(counter < vector.length){
            System.out.print(vector[counter] + " ");
            counter++;
        }

        //print in reverse order
        for(int i = (vector.length -1); i >= 0; i--) {
            System.out.print(vector[i] + " ");
        }

    }
}
