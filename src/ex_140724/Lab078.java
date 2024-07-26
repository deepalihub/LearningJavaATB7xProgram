package ex_140724;

public class Lab078 {
    public static void main(String[] args) {
                String password = "Deepali@1234";
                String pass_u = password.toLowerCase();
                 System.out.println(pass_u);
        // pass_u == password
        System.out.println(password == pass_u);
        System.out.println(password.equals(pass_u));
        System.out.println(password.equalsIgnoreCase(pass_u));
    // deepali@1234 DEEPALI@1234 DEEpali@1234 deEpali@1234


        System.out.println(password.substring(0,4));
        System.out.println(password.indexOf('l'));
        System.out.println(password.length());
    }
}
