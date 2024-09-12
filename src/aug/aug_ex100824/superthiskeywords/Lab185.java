package aug.aug_ex100824.superthiskeywords;

public class Lab185 {

    // super.variable
    // super.method
    // super()  DC
    // super("deep")   PC

    // this()
    // this.variablename

}
class Person1{

    Person1(){
        System.out.println("  Person1  DC   ");
    }

    Person1(String a ){
        System.out.println(" Person1    PC    A1   ");
    }

    Person1(String a , int a1){
        System.out.println("   Person1    PC     A2    ");
    }
}

class Student1 extends Person1{
    Student1(String a){
        System.out.println("   PC  -- Student");
    }

    Student1(){
       // this("Deep");
        super();
       // System.out.println(this.a);
        //  super("Deep");
        //  super("Deep",47)
    }



}