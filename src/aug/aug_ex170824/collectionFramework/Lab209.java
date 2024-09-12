package aug.aug_ex170824.collectionFramework;

public class Lab209 {
    public static void main(String[] args) {
        String ip = args[0];// Array index out of bounce exception
        int a = Integer.parseInt(ip); //Number Format Exception
        int b = 1000/a;  //arithmatic exception
        System.out.println(b);

        //JVM will be Initialized
        //Creates and Starts the main Thread. - Main Called
        //1)Collects the Command Line Arguments
        //2)Creates the String array with CLI
        //3. Lab209.main(0)
        //Now Control will be transferred from main Thread to main method
        // When problem comes in main -> JVM
        // If don't handle the exception JVM -
        // Exception a=new Exception() and terminate the program.
    }
}
