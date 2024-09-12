package aug.aug_ex100824.poly.methodoverloading;

public class Lab181 {

    // Polymorphism
    public static void main(String[] args) {

        MathOperations mathOperations = new MathOperations();
        int result = mathOperations.add(2,3);
        double result2 = mathOperations.add_double(2.4,3.6);
        String result3 = mathOperations.add("deep","raut");
        String result4 = mathOperations.add("deep",4);
        System.out.println(result);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
    }

}
