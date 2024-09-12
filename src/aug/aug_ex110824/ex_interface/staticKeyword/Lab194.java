package aug.aug_ex110824.ex_interface.staticKeyword;

public class Lab194 {
    public static void main(String[] args) {

       //  System.out.println(ATB.courseName);
        ATB a1 = new ATB("ajit");
      //    System.out.println(a1.getName());

     //   ATB a2 = new ATB("Dhananjay");
       //   System.out.println(a2.getName());
        //   ATB.doAssignments();
    }
}
class ATB{

    {
        System.out.println("IIB");
        // What is the purpose
        // Here you can write a code related to
        // Start a website or anything before starting the
        // wed automation or API automation
        System.out.println("Reading from CSV file");

    }

    static {
        System.out.println("Load the class ?  i will execute");
    }
    private String name;
    static String courseName = "ATB";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ATB(String name) {
        this.name = name;
    }

    static void doAssignments(){
        System.out.println("Do a Assignments");

    }
}