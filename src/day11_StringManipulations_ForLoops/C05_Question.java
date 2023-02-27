package day11_StringManipulations_ifLoops;

public class C05_Question {
    public static void main(String[] args) {



    /*
    Question 2: Collect and print the String prices given by the user in a certain format.
    input1: “15.30 €” , input2: “11.40 €”
    output : 26.71 €
     */

        String input1 = "15.31 €";
        String input2 = "11.40 €";

        double sum = 0;

        input1 = input1.replaceAll("\\D","");
        System.out.println(input1);

        input2 = input2.replaceAll("\\D", "");
        System.out.println(input2);

        double inp1 = Double.parseDouble(input1);
        double inp2 = Double.parseDouble(input2);

        sum = (inp1+inp2)/100;
        System.out.println(sum);

        System.out.println(sum + "$");

    }
}
