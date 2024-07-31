package ex_270724;
import java.util.Scanner;


public class Lab139 {
    public static void main(String[] args) {
        // declare a new array
        int marks[] = new int[3];
        //Array index 0 1  2
        // array length 3
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        Scanner sc = new Scanner(System.in);
        marks[0] = sc.nextInt();
        marks[1] = 77;
        marks[2] = 55;

        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
      //  System.out.println(marks[10]);   array index out of bounce

        boolean is_married[] = {true,false,true};
            for(int i = 1; i < marks.length; i++){
                // i = 0  1   2
                System.out.println(i +" -->  "+marks[i]);
            }

        String weekDays[] = {"mon", "tues","wed","saturday","sunday"};
            for(int i = 0; i < weekDays.length;i++){
                System.out.println(weekDays[i]);
            }

    }

}
