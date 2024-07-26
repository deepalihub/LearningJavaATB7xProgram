package ex_140724;

public class Lab065 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(++a + a++ + a++);

        // exp = 11;    a = 11;
        //  +
        // exp 11     a = 12 ;
        // exp 12     a = 13;
        System.out.println(a);

    }
}
