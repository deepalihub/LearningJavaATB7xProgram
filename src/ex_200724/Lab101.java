package ex_200724;
import java.util.Scanner;

public class Lab101 {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
        System.out.println("enter your name");
        String name = sc.next();

        System.out.println("Enter ur age");
        int age = sc.nextInt();

        System.out.println("enter ur salary");
        double sal = sc.nextDouble();


        System.out.println("Your details are" +name);
        System.out.println("Your age is" +age);
        System.out.println("Your salary is" +sal);

        sc.close();

    }
}
