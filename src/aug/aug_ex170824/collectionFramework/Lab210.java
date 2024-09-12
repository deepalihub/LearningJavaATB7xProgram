package aug.aug_ex170824.collectionFramework;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Lab210 {
    public static void main(String[] args) {
        // Exception
        // checked  --- JVM knows
//        try {
//            FileInputStream file = new FileInputStream("c://log.txt");
//        }catch(FileNotFound Exception e){
//            throw new RuntimeException(e);
//        }

        //UNchecked Exception
        try {
            int a = 10;
            int c = a / 0;   // java.lang.ArithmeticException
            System.out.println("c");
        }catch(Exception e){
            System.out.println("error divide by zero");
        }
        System.out.println("end of the Program");
    }
}
