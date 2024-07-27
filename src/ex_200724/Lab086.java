package ex_200724;

import java.util.Scanner;

public class Lab086 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // obect of the scanner Class - OOPs
        System.out.println("Enter the num 1");
        int user_input = sc.nextInt();

        System.out.println(user_input);

        if(user_input%2==0){
            System.out.println("Even");
        }else {
            System.out.println("Odd");
        }
    }
}