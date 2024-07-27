package ex_200724;

public class Lab098 {
    public static void main(String[] args) {
        // JDK > 13

        int itemcode  = 006;
        switch (itemcode){
            case 001 -> System.out.println("its a laptop");
            case 002,003 -> System.out.println("its a desltop");
            case 004,005,006 -> System.out.println("its a mobile phone");
            default -> System.out.println("Hellooo....");
        }


// this is upgrade in java 17
    }
}
