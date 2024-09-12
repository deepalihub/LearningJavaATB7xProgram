package aug.aug_ex170824;

public class Lab202 {
    public static void main(String[] args) {
        Car c = new Car("Lambo");
        c.drive();
        System.out.println(c.make);

        // To access the inner class members
        Car.GearBox cg = c.new GearBox();   // to access the m2()
        cg.m2(); // access the m2()
    }
}
class Car{
    String make;
    public Car(String make){

        this.make = make;
    }
    // Method
    void drive(){
        System.out.println("YOU can Drive a Car");
    }

    class GearBox{
        void m2(){
            System.out.println("m2");
        }

      class NutBolts{

      }
}


}