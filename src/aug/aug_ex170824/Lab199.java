package aug.aug_ex170824;

public class Lab199 {
    public static void main(String[] args) {
        A a = new A();
        A a2 = new A();

        a.age = 12;
        System.out.println(A.discount);
        a.m2();
        A.m1();  // static
        // Static dont need object Ref   ---True
    }
}
class A{
    int age = 10; // instance variable
    static int discount = 199;      // static variable
    static{
        System.out.println("SIB-A");
    }
    {
        System.out.println("IIB");
    }
    static void m1(){
        System.out.println("m1");
    }
    void m2(){
        System.out.println("m2");
        System.out.println(discount);
    }
}