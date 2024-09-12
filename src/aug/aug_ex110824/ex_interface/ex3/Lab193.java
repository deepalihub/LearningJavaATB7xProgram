package aug.aug_ex110824.ex_interface.ex3;

public class Lab193 {
    public static void main(String[] args) {
        Car c = new Car();
        c.start();
        c.m1();
    }

}
interface Eng{
    void start();
    default void m1(){
        System.out.println("old M1");
    }
    default void suite(){
        System.out.println("wear suite");
    }
}

interface GearBox extends Eng{
    void gear();
}

interface Keys extends GearBox{
        void openCar();
}

class Car implements Keys{

    @Override
    public void start(){
        System.out.println("Starting");
    }

    @Override
    public void gear() {

    }

    @Override
    public void openCar() {

    }
}