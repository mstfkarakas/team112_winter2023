package day12_ForLoops;

public class C09_02_NestedLoops {
    public static void main(String[] args) {

        // verilen bir rakam icin carpim tablosu olusturun

        /*
                1  2  3  4  ==> 1*1 1*2 1*3 1*4
                2  4  6  8  ==> 2*1 2*2 2*3 2*4
                3  6  9 12  ==> 3*1 3*2 3*3 3*4
                4  8 12 16  ==> 4*1 4*2 4*3 4*4
         */

        // First, let's do it without nested for loop
        int number = 6 ;

        // k >>> This is used to have the second row, third row, fourth row etc.

        for (int k =1; k<=number; k++) {
            for (int i = 1; i <= number; i++) {

                System.out.print(k * i + " ");
            }
            System.out.println();
        }

    }
}
