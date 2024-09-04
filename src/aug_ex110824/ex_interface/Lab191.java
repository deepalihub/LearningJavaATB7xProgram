package aug_ex110824.ex_interface;

public class Lab191 {
    public static void main(String[] args) {
        // I i = new I();   Its not Possible to create Interface object
    }
}
interface I{}

class A{}  // concrete class
class B{}
abstract class C{}   // NOn concrete class
class Test1 extends A{}  // okay
class Test2 extends B{}  // okay
//class Test3 extends A,B{}  // Not Possible cz its Multiple Inheritance
class Test0 implements I{}
interface I1{}
interface I2{}
class Test4 implements I1,I2{} // possible cz Multiple Inheritance with Interface
class Test5 extends A implements I1,I2{}
//class Test6 implements I1 extends A{}  Not Possible
//interface I3 extends A{}    Interface can not extends anything
//interface I4 implements A{}  // A is con class that why not Possible
//interface I5 extends A,B{} //Not Possible ---> interface can not extends anything
interface I6 extends I1,I2{}  // interface can extend another interfaces but not the class
//interface I7 extends C{} // interface not extend a single class


