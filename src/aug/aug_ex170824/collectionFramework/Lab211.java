package aug.aug_ex170824.collectionFramework;

public class Lab211 {
    public static void main(String[] args) {
        int c = 2;
        try {
            c = 10/c;
        } catch (Exception e) {
            System.out.println("divide by zero error" );
        }
        System.out.println(c);
        System.out.println("End of the program");
    }
}
