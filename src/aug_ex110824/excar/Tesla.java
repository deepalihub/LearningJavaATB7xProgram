package aug_ex110824.excar;

public class Tesla extends Engine{

    void drive(){
        openCar();
        start();
        partGearBox();
        stop();
    }

    @Override
    void start() {
        System.out.println("Starting the Tesla");
    }

    @Override
    void stop() {
        System.out.println("Stoping the Tesla");
    }

    @Override
    void speed() {
        System.out.println("300 km/hr");
    }

    @Override
    void partGearBox() {
        System.out.println(" Electric ");
    }

    @Override
    void openCar() {
        System.out.println("open Tesla");
    }
}
