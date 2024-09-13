package aug.ex180824;

import java.util.Scanner;

public class Lab224 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if (x == 0){
            throw new ArithmeticException("Enter the non Zero Number");
        }
        int a = 10/x;
        System.out.println(a);
    }
}
