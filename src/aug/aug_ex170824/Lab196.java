package aug.aug_ex170824;

public class Lab196 {
    public static void main(String[] args) {
        // Wrapper class to Primitive

        int a = 10;
        Integer b = a;
        System.out.println(a);
        System.out.println(b);  // extra utilities are added

        // Primitive to Wrapper class
        Integer a2 = 42;   // AutoBoxing int ---->  Integer
        int value = a2;     // UnBoxing  Integer ---->int conversion
        System.out.println(a2);
        System.out.println(value);


    }
}