package ex_200724;
import java.util.Scanner;

public class Lab092 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the day from 1-7 ,tell what day it is");
        int day = sc.nextInt();

        switch (day) {
            case 1:
                System.out.println("mon");
                break;
            case 2:
                System.out.println("tues");
                break;
            case 3:
                System.out.println("wed");
                break;
            case 4:
                System.out.println("thurs");
                break;
            case 5:
                System.out.println("fir");
                break;
            case 6:
                System.out.println("sat");
                break;
            case 7:
                System.out.println("sun");
            default:
                System.out.println("no idea what day it is");

        }

        System.out.println("outside the loop");
    }
}