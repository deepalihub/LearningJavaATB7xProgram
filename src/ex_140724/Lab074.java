package ex_140724;

public class Lab074 {
    public static void main(String[] args) {
         String name = "The Testing Academy";
         String name1 = "The Testing Academy";

         // 1 SCP

        String name2 = new String ("The Testing Academy");  // Heap area
        String name3 = new String ("The Testing Academy");  // Heap area
        // 2 Value in Heap

        System.out.println(name == name1);  // check for the ref
        System.out.println(name.equals(name1));   // check for the content

        System.out.println(name1 == name2);   // check for the ref
        System.out.println(name1.equals(name2));  // check for the content



    }
}
