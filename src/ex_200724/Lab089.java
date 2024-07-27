package ex_200724;

import java.util.Scanner;


public class Lab089 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = sc.nextInt();

        if(age>18){
            System.out.println("u allowed to Goa");
        }else if(age>30){
            System.out.println("you allowed to maldives");
        }else{
            System.out.println("dont go anywhere");
        }
    }
}
