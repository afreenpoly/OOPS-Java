public class Main {
    public static void main(String[] args) {
        // Using String literals
        String str1 = "Hello";
        String str2 = "Hello";

        // Using new String() constructor
        String str3 = new String("Hello");
        String str4 = new String("Hello");

        // Comparing string literals using ==
        if (str1 == str2) {
            System.out.println("str1 == str2 is true (String literals)");
        } else {
            System.out.println("str1 == str2 is false (String literals)");
        }

        // Comparing string objects using ==
        if (str3 == str4) {
            System.out.println("str3 == str4 is true (new String())");
        } else {
            System.out.println("str3 == str4 is false (new String())");
        }

        // Comparing string literals using .equals()
        if (str1.equals(str2)) {
            System.out.println("str1.equals(str2) is true (String literals)");
        } else {
            System.out.println("str1.equals(str2) is false (String literals)");
        }

        // Comparing string objects using .equals()
        if (str3.equals(str4)) {
            System.out.println("str3.equals(str4) is true (new String())");
        } else {
            System.out.println("str3.equals(str4) is false (new String())");
        }
    }
}
