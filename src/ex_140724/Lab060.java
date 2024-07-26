package ex_140724;

public class Lab060 {
    public static void main(String[] args) {
        // increment (++) operator ----->   decrement (--) operator
        // pre and post increment
        // Ready
        int a = 10;
        int b = ++a;    // a = a + 1
        System.out.println(a);
        // EXpression = 11,  b = 11;
        System.out.println(b);


        int a_pre = 11;
        System.out.println(++a);
        // Expression = 12  , a = 12

        int a_post = 20;
        System.out.println(a_post++);
        //Expression = 21    a_post = 20
    }
}
