package aug.aug_ex170824;

public class Lab216 {
    public static void main(String[] args) {
        try {
            int a = 10/0;
        } catch (Exception e) {
            System.out.println("Div by Zero");
        } finally {
            System.out.println("I will be Executed anyHow");
        }
    }
}
