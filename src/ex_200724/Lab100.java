package ex_200724;

public class Lab100 {
    public static void main(String[] args) {
                //  JDK >13

        char code = 'B';
        int val = switch (code){
            case 'A':
                yield 65 ;

            case 'B':
                yield 66;

            default :
                throw new IllegalStateException("Unexpected value..."+code);
        };
        System.out.println(val);
    }
}
