package ex_210724;
import java.util.Scanner;


public class Lab130 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of fact");
        int n = sc.nextInt();
        int fact = 1;
        for(int i = 1; i<= n; i++){
            fact = fact*i;
        }
        System.out.println(fact);

        sc.close();

    }
}
