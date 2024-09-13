package aug.ex180824;

public class Lab128 {
    public static void main(String[] args) {
        extracted();
    }

    private static void extracted() {
        extracted1();
    }

    private static void extracted1() {
        try {
            Integer[] i = new Integer[2];
            System.out.println(i[3]);
        } catch (Exception e) {
            System.out.println("Array Index Out OF Bounds Exception");
        }finally{

            // file.close sc.close , SQL connection.close
            System.out.println("end of the program");
        }
    }
}
