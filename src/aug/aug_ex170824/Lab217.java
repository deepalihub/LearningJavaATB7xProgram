package aug.aug_ex170824;

public class Lab217 {
    public static void main(String[] args) {
        try {
            int a = 10/0;   // Unchecked Arth Exception
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        try {
            FileReader f = new FileReader(("c://a.txt"));
        } catch (FileNotFound Exception e) {
            throw new RuntimeException(e);
        }
    }
}
