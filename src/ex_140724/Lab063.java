package ex_140724;

public class Lab063 {
    public static void main(String[] args) {

        int a = 10;

        System.out.println(a++ + ++a);

        // we have to print Expression value only
        // a++    Exp = 10                  post increment    a++ = 11
        //  +
        // ++a    Exp =  12               pre increment   a = 12

        System.out.println(a);

    }
}
