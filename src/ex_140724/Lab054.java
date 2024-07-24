package ex_140724;

public class Lab054 {
    public static void main(String[] args) {
        byte b1 = 11;
        byte b2 = 22;
        int c = b1+b2;
        System.out.println("the add is \n"+c);

        char c1 = 'A';    // char are also int only
        char b = 'B';
        int res = c1+b1;   // if we use string its not possible cz A B are single char
        //the result = AB this is not possible cz char store only single char
        System.out.println("the num display ascii value of A and B\n"+res);

        System.out.println('A' == 65  );
        System.out.println('B' == 67 );  // char always integers

    }
}
