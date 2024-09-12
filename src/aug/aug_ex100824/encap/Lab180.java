package aug.aug_ex100824.encap;

public class Lab180 {
    public static void main(String[] args) {
        ICICIBank ajit = new ICICIBank("Ajit",100);

        //Set the balance
        // admin
        ajit.setBal(10000000,false);
        System.out.println(ajit.getName());
        System.out.println(ajit.getBal());

       ICICIBank admin = new ICICIBank("admin",1000);
       admin.setBal(50000,true);

        System.out.println(admin.getName());
        System.out.println(admin.getBal());

    }
}
