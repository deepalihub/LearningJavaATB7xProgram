package aug.aug_ex100824.encap;
// Encapsulation Fixed

    public class Lab179 {
        public static void main(String[] args) {
            VWOLogin1 vwoLogin = new VWOLogin1("admin","password123");
            System.out.println(vwoLogin.getUsername());
            vwoLogin.setUsername("Deep");
            System.out.println(vwoLogin.getUsername());

            // Write a code to Auth
            // Deep isAuth true
            vwoLogin.setPassword("1234",true);

        }
    }

    class VWOLogin1{

        // Data Members
        private String username;
        private String password;

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password,boolean isAuth) {
            if(isAuth){
                this.password = password;
            }else{
                System.out.println("Not Allowed");
            }

        }

        public VWOLogin1(String username, String password) {
            this.username = username;
            this.password = password;
        }
    }
