package ex_200724;
import java.util.Scanner;

public class Lab094 {
    public static void main(String[] args) {
// Take a user ip and tell the user if it is vowel
        // a e i o u
        Scanner sc = new Scanner(System.in);
           System.out.println("enter the char to check it is vowel or not");

        char user_ip = sc.next().charAt(0);
           // char user_ip = sc.next().charAt(0);
        System.out.println(user_ip);
        switch (user_ip){
            case 'a':
                System.out.println("char is vowel");
                break;

            case 'e':
                System.out.println("char is vowel");
                break;

            case 'i':
                System.out.println("char is vowel");
                break;

            case 'o':
                System.out.println("char is vowel");
                break;

            case 'u':
                System.out.println("char is vowel");
                break;
        }
    }
}
