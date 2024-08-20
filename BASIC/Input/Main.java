import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter your Name");
            String name=sc.nextLine();
            
            System.out.println("Enter your Age");
            int Age = sc.nextInt();
            //Refer Notes1.1
            
            
            // System.out.println("Enter your Fav Food");
            // String Food = sc.nextLine();
            // Why is this causing a problem? Refer-Notes1.2
            
            System.out.println("Hi " + name);
            System.out.println("You are "+Age+" years old");
        }


    }
}