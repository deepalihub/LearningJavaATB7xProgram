package ex_270724;

public class Lab151 {
    public static void main(String[] args) {
            //  STRING  bunch of characters

        String s1 = new String("Deepali");   // stored in heap area
        String s2 = "Deepali Raut";          // stored in String Constant Pool SCP

    //  String Immutable in nature
        System.out.println(s1.length());
        System.out.println(s1.indexOf("D"));
        System.out.println(s1.toLowerCase());



    }
}
