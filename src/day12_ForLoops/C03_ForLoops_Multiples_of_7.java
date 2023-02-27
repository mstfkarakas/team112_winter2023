package day12_ForLoops;

import java.util.Scanner;

public class C03_ForLoops {
    public static void main(String[] args) {

        // Question 2- Take a positive integer from the user, print numbers divisible by 7 from 1 to the entered
        //number (including the entered number).

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an integer to see multiples of 7 btw 1 and your number:  ");
        int endingNumber = scan.nextInt();

        for (int i=1; i<=endingNumber; i++) {
            if (i%7==0) {
                System.out.println(i + " ");  // no else here. so nothing will be printed for non-multiples
            }
        }


    }
}
