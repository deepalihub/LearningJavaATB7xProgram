package aug.aug_ex110824.excar;

class Car extends Engine {
    // engine
    // gearbox
    // keys

    //Tesla is A Car
    // Tesla --Drive()

    @Override
    void openCar(){
        System.out.println("Open the car");
    }

    @Override
    void partGearBox(){
        System.out.println("part of the GearBox");
    }

    @Override
    void stop(){
        System.out.println("Stop the Car");
    }

    @Override
    void speed(){
        System.out.println("speed the Car");
    }


    @Override
    void start() {
        System.out.println("start the car");

    }


}
