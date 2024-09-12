package aug.aug_ex110824.ex_interface;

public class WagonR implements Engine{

    @Override
    public void startEngine() {
        System.out.println("Wagon R is starting ");
    }

    @Override
    public void stopEngine() {
        System.out.println("Wagon R is Stopping");
    }
}
