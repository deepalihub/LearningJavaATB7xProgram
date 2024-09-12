package aug.aug_ex170824.collectionFramework;

public class Lab212 {
    public static void main(String[] args) {
        System.out.println("strat of the program");

        int b = 0 ;    // Array index out of bounce exception
        try {
           String ip = args[0];
            int a = Integer.parseInt(ip); //Number Format Exception
             b = 1000 / a;  //arithmatic exception
        } catch (ArithmeticException| NumberFormatException| ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(b);
        System.out.println("End of the program");
    }
}