//Ceci importe la classe Scanner du package java.util
import java.util.Scanner; 
//Ceci importe toutes les classes du package java.util
//import java.util.*;

public class FizzBuzz{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez saisir un chiffre :");
        int i = sc.nextInt();

        if(i%3 == 0){
            System.out.print("Fizz");
            if(i%5 == 0){
                System.out.print("Buzz");
            } 
        }
        else if(i%5 == 0){
            System.out.print("Buzz");
        }
        else{
            System.out.print(i);
        }

    }
}