package ex_140724;

public class Lab067 {
    public static void main(String[] args) {
        // String =======>>>>>    bunch of char or collection of char
        String name = "Deepali";
            //class   ?

        String name2 = new String("Deepali");
        // How many ways we create a String ---->  2
        //   =        ----->     by using normal operator
        //    new     ------> by using New operator
        // = , new
        // =  stror the value in SCP (string constant pool)
        //  new basically stores the value in objects(Heap)

        System.out.println(name.toLowerCase());
        System.out.println(name.length());
        System.out.println(name.toUpperCase());
        System.out.println(name.charAt(0));
        System.out.println(name.charAt(4));
       // System.out.println(name.charAt(7));
        System.out.println(name.charAt(2));

    }
}
