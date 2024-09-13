package aug.ex180824;
import java.util.Scanner;

public class Lab223 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter ur name");
        String name = sc.next();
        if (name.equalsIgnoreCase("geeta")){
            try {
                throw new Exception("NOT allowed");
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }else {
            System.out.println("Allowed");
        }

    }
}
