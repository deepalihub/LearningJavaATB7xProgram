package ex_140724;

public class Lab056 {
    public static void main(String[] args) {

        // Widning
        byte b = 10;
        int a = b;          // Valid Implicit casting
        int a1 = (int)b;     // Valid Explicit casting
        // Narrowing
        System.out.println(a1);
        int val = 289   ;      //300;
        // byte b = val;        // Invalid Implicit casting
        byte b1 = (byte)val;    // Valid Explicit Casting
        System.out.println(b1);
    }
}
