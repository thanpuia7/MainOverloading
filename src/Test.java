import java.io.*;
 
public class Test {
     
    // Normal main()
    public static void main(String[] args) {
        System.out.println("Hi lalthanpuia (from main)");
        Test.main("Thor");
    }
 
    // Overloaded main methods
    public static void main(String arg1) {
        System.out.println("Your name is: "+ arg1+" (From main with one parameter)");
        Test.main("Thanos","wants to know your location");
    }
    public static void main(String arg1, String arg2) {
        System.out.println("Hi, " + arg1 + ", " + arg2+"(From main with two parameters)");
    }
}
