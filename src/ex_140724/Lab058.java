package ex_140724;

public class Lab058 {
    public static void main(String[] args) {
        int course = 100;
        float GST = 18.45f;
        // int total_price = course + GST;  // Implicit Narrowing   JVM

         int total_price = course + (int) GST;   // Explicit Narrowing ----> REAL TIME
        // O/P  118
        System.out.println(total_price);

    }
}
