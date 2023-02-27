package day11_StringManipulations_ifLoops;

public class C02_nullPointer {
    public static void main(String[] args) {

        String str;

//      System.out.println(str);                 CTE  Compile Time Error
//      System.out.println(str.concat("Ali"));   CTE

        String str2 = null;

        System.out.println(str2);  // null

//      System.out.println(str2.length());          (RTE) Run Time Error - Exception
//      System.out.println(str2.concat("Ali"));     (RTE) Run Time Error - Exception

        System.out.println(str2 + "Java");  // nullJava  Here String converts str2 into a string since string is 'STRONG'


//      int a = null;  It doesn't accept it
        Integer a = null;  // Wrapper class accepts null as value.

        System.out.println(a);  // null

        String str3 = "";

        System.out.println(str3.concat("Java"));  // nothing before "Java"

    }
}
