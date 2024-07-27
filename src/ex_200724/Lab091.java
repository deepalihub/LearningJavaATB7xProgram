package ex_200724;

public class Lab091 {
    public static void main(String[] args) {

        if (true){
            System.out.println("1");
                if (true){              // if(false)   ----> op = 1
                    System.out.println("2");
                    if (true){
                        System.out.println("3");
                    }
                }
        }
    }
}
