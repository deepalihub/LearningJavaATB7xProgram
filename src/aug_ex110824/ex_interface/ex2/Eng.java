package aug_ex110824.ex_interface.ex2;

public interface Eng {

    void startEngine();
    void stopEngine();

    default void haltingEngineJustStart(){
        System.out.println("Halt the Engine");
    }
    default void haltingEngineJuststop(){
        System.out.println("Halt the Engine");
    }
    static void M1(){
        System.out.println("M1");
    }

    void m4();
    void m3();

    // void m2(){
     //   System.out.println("m2");  not possible complete methods
     // }
}
