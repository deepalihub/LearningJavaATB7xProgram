package aug.ex180824;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Lab220 {
    public static void main(String[] args) throws FileNotFoundException {
        readFile();

    }

    private static void readFile() throws FileNotFoundException,ArithmeticException {
        System.out.println("Heloo Pramod");
        String path = "C://a.txt";
        File file = new File(path);
        FileReader fileReader = new FileReader(file);

        int a = 10/0; //arth exptin
        // read the file txt it can read the file
        System.out.println("End of the program");
    }
}
