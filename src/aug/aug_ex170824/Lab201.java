package aug.aug_ex170824;

public class Lab201 {
}
// Nested class --- Rarely used

class OC{
    Integer a = 10;
    void OC_m1(){
        System.out.println("OC_m1");
    }
    class Innerclass{
        Integer b = 20;
        void Inner_m2(){
            System.out.println(a);
            System.out.println("OC_M1");
        }
    }

}