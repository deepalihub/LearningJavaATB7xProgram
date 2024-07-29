package ex_210724;

public class Lab132 {
    public static void main(String[] args) {

        // diffrenece between while and do while
        int i = 10;
        while (i<10){
            System.out.println(i);
            i++;
        }

        do{                                     // do always run one time
            System.out.println(i);
            i++;
        }while(i < 10);
    }
}
