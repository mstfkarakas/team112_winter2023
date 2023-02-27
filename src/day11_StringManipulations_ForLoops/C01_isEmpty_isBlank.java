package day11_StringManipulations_ifLoops;

public class C01_isEmpty_isBlank {
    public static void main(String[] args) {

        String str = "JAva is the life";
        System.out.println(str.isEmpty());  //  false
        System.out.println(str.isBlank());  //  false

        String str2 = "    ";   // spaces

        System.out.println(str2.length());  // 4 characters
        System.out.println(str2.isEmpty()); // false
        System.out.println(str2.isBlank()); // true    GOOD TO KNOW

        String str3 = "";

        System.out.println(str3.isEmpty());  // true
        System.out.println(str3.isBlank());  // true

        System.out.println(str3.length());   // 0

    }
}
