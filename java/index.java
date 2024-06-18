// code to display biodata
Import java.util;
Import java.util.Scanner;

public class Main{
    public static void Main(string[]args){
        system.out.println("My Name Is Tobenna");
    }

    class biodata{
        int age, int matric, String name, String department;

        Scanner biodata = new Scanner(system.in);

        system.out.print("Enter your age: ");
        int age = biodata.nextInt();

        system.out.print("Enter your matric number: ");
        int matric = biodata.nextInt();

        system.out.print("Enter Your name: ");
        String name = biodata.nextLine();

        system.out.print("Enter your department: ");
        String department = biodata.nextLine();

        system.out.println("This what you filled:");

        system.out.println("NAME:" + name);
        system.out.println("AGE:" + age);
        system.out.println("MATRIC:" + matric);
        system.out.println("DEPARTMENT:" + department);


        biodata.close();

    }
}