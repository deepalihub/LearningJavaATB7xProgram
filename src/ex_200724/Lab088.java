package ex_200724;
import java.util.Scanner;


public class Lab088 {
    public static void main(String[] args) {
        // take user ip n find out num id is even or odd
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the num 1");
        int num1 = sc.nextInt();

        System.out.println("Enter the sec num 2");
        int num2 = sc.nextInt();

        //  System.out.println(Math.max(num1,num2));

        if(num1 > num2){
            System.out.println(num1);
        }else if(num2 > num1)
        {
            System.out.println(num2);
        }else {

            System.out.println("Equal");
        }

    }
}
