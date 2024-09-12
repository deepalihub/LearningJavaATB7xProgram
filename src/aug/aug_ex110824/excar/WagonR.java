package aug.aug_ex110824.excar;

public class WagonR extends Engine {


    void drive(){

        openCar();
        start();
        partGearBox();
        speed();
        stop();
    }

    @Override
    void start(){
        System.out.println("Start WagonR");
    }

    @Override
    void stop(){
        System.out.println("Stop WagonR");
    }

    @Override
    void speed(){
        System.out.println("100 km/hr");

    }

    @Override
    void partGearBox(){
        System.out.println("WagonR");
    }

    @Override
    void openCar() {
        System.out.println("open the keys");
    }


}
