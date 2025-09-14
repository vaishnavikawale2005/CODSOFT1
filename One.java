package CODSOFT;

import java.util.Random;
import java.util.Scanner;

public class One {
public static void main(String[] args) {
    Random random=new Random();
    int randomno=random.nextInt(100)+1;

    Scanner scanner=new Scanner(System.in);
    int guess;


    System.out.println("I am thinking of a number between 1 and 100.Will you guess it!");

    while (true) {
        System.out.print("Enter Your guess:");
        guess=scanner.nextInt();

        if(guess==randomno)
        {
            System.out.println("Nicee  You guessed the correct number");
            break;
        }
        else if (guess < randomno) {
            System.out.println("Too low..! Try again.");
            
        }
        else
        {
            System.out.println("Too high..! Try again.");
     
        }
    }
}
}
