package aug_ex100824.superthiskeywords;

public class Lab183 {

    public static void main(String[] args) {
        Car c = new Car();
        c.display();
    }
}
class Car extends Vehicle{
        private int maxSpeed = 280;

        Car(){
            super(10);                      // Constructor chaining
    System.out.println("DC of Car");

}

     public void display(){
            System.out.println("car speed is "+ this.maxSpeed);
            System.out.println("vehicle speed is "+ super.maxSpeed); // super is used to access parent
         super.message();
         this.message();
        }

        @override
    void message(){
        System.out.println("Hello Vehicle");
    }
}

class Vehicle{
    public int maxSpeed = 180;

    Vehicle() {
        System.out.println("DC constructor of Vehicle");
    }

    Vehicle(int a ) {
        System.out.println("PC constructor of Vehicle");
    }

    void display(){
        System.out.println("");
    }

    // this two void message () is a methid overloading;;;;;;
    void message(){
        System.out.println("Hello Vehicle");
    }

    void message(int a){
        System.out.println("Hello Vehicle");
    }

}