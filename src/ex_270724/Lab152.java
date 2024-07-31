package ex_270724;

public class Lab152 {
    public static void main(String[] args) {
        // String builder  String Buffer  mutable in nature
        // String is immutable in nature
        String s1 = "RautD";
            s1 = "Deepali";
        StringBuffer stringBuffer = new StringBuffer("Deepali");
            // change the value of the sting buffer
        stringBuffer.append("Raut");

            StringBuilder stringBuilder = new StringBuilder("Geeta");
            stringBuilder.append("Neet");

    }
}
