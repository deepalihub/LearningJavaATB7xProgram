package ex_200724;
import java.util.Scanner;


public class Lab093 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the browser name :: where u want to exdecute the program");
        String browserName = sc.next();
        browserName = browserName.toLowerCase();

        switch(browserName){
                case "chrome":
                System.out.println("starting the chrome browser");
                break;
            case "Mozilla firefox":
                System.out.println("starting the firefox");
                break;
            case "Edge":
                System.out.println("starting the edge");
                break;
            default:
                System.out.println("i hv no idea which browser it is");
                break;
        }
    }
}
