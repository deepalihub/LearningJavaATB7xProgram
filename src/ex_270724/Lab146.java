package ex_270724;
import java.util.Scanner;

public class Lab146 {
    public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);
        float marks[] = new float[5];
        for(int i = 0; i < marks.length; i++){
            System.out.println("Enter the marks of subject"+ (i+1));
            // (i+1) bcz there is no subject 0 ,index value start from zero bt we count sub as 1,2,3,
            marks[i] = sc.nextFloat();

        }

        float avg =(marks[0]+marks[1]+marks[2]+marks[3]+marks[4])/5;
        System.out.println("Avg"+avg);


    }
}
