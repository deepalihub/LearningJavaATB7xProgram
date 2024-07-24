package ex_140724;

public class Lab057 {
    public static void main(String[] args) {
        long phone_no = 9874563210l;
        // short s = phone_no;  // Implicit Narrowing ....JVM ?

        short s = (short) phone_no;
        System.out.println(s);
    }
}
