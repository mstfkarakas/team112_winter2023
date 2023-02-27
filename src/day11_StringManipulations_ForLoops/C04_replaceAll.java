package day11_StringManipulations_ifLoops;

public class C04_replaceAll {
    public static void main(String[] args) {

        /* We replace ALL LETTERS or ALL SYMBOLS or ALL NUMBERs

        Regex (Regular Expressions)
            \\s : space \\S : space olmayan hersey
            \\s+: yanyana birden fazla space
            \\d : digits
            \\D : digit olmayan hersey
            \\w : harf veya rakam
            \\W : harf veya rakam olmayan hersey

        */
        String str = "Java123 is%$%^ beautiful";

        // clear str from numbers
        str = str.replaceAll("\\d", "");

        System.out.println(str);


        // clear all symbols without deleting the spaces??

            // 1) replace all spaces with numbers. TRICK

        str = str.replaceAll(" ", "5");
        System.out.println(str);

            // 2) delete symbols
        str = str.replaceAll("\\W", "");  // deletes all (including spaces) except numbers and letters.
        System.out.println(str);  //  Javaisbeautiful  SPACES are also deleted. How to solve?
            // 3) replace numbers back with numbers
        str = str.replaceAll("5", " ");
        System.out.println(str);


    }
}
