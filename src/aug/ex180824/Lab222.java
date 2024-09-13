package aug.ex180824;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Lab222 {

    public static void main(String[] args) throws Exception {
        // Throws
        // Custom Exeception
        Bank sbi = new Bank("INR",100);
//        Bank icici = new Bank("INR",10);
//        Integer total = sbi.add(icici);
//        System.out.println(total);
        Bank jpmorgan = new Bank("INR",89);
        Integer totalnew = sbi.add(jpmorgan);
        System.out.println(totalnew);

    }
}
