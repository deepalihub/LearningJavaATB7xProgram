package aug_ex040824.multilevelinheritance;

public class Lab174 {
    public static void main(String[] args) {

        // Multi level
        // GF--->  Father---> Child

        Child c1 = new Child();
        c1.home();
        c1.gf();
        c1.f();
        c1.c();
    }
}
