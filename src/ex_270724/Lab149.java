package ex_270724;

public class Lab149 {
    public static void main(String[] args) {

        int array_2d[][] = {
                {34,12,11},
                {34,12,34},
                {11,23,98}
        };
        for(int i = 0; i < array_2d.length; i++){
            for(int j = 0; j < array_2d[i].length; j++){
                System.out.print(array_2d[i][j]);
                System.out.print("   ");
            }
            System.out.println();
        }

    }
}
