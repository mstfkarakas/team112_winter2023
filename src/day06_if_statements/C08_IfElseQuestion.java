package day06_if_statements;

import java.util.Scanner;

public class C08_IfElse {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("What is your age?");
        int age = scan.nextInt();

        if (age>=65) {
            System.out.println("You can retire since you're " + age + " years old");
        }
        else {
            System.out.println("You can't retire yet since you need " + (65 - age) + " more years to retire");
        }



    }
}
