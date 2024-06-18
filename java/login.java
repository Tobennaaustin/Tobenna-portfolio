// code to demonstrate a login page
// compiled by tobenna!!!
Import java.util;
Import java.util.Scanner;

public class Main{
    public static void Main(string[]args){
        
        Scanner login = new Scanner(system.in);

        int code = 112200, String name, int password;

        system.out.println("LOGIN FORM");

        system.out.print("Enter your name: ");
        String name = login.nextLine();

        system.out.print("Enter your password");
        int password = login.nextInt();

        if (password == code){
            system.out.println("Login");

            system.out.println("Continue.....");
            system.out.print("Change the default password");
            int new_code;

            int new_code = login.nextInt();

            system.out.println("Your new password is:" + new_code);
        }
        else{
            system.out.println("Incorrect password");
        }
    }
}