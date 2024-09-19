package aug.ex180824.CollectionFramework;


import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


public class Lab228 {
    public static void main(String[] args) {

        // Collection Framework
        // collection Interface
        // collection(I)--> List(I)
        // List --->  Arraylist LinkedList  Stack Vector

        // Shopping list ,collection of items,mark list ,to do List ,Student List

        // How to create a Linked List

        List mylist = new ArrayList();      //Dynamic Dispatch
       // ArrayList mylist2 = new ArrayList();
        Collection mylist3 = new ArrayList();   //Dynamic Dispatch

        ArrayList mylist2 = new ArrayList();
        mylist2.add("deep");
        mylist2.add("neet");
        mylist2.add("geet");
        mylist2.add("dhanu");
        mylist2.add(123);
        mylist2.add(true);
        System.out.println(mylist2);

        System.out.println(mylist2.size()); // 4
        System.out.println(mylist2.contains("deep")); // true
        System.out.println(mylist2.contains("ajit")); // false
        String s1 = (String) mylist2.get(1);
        System.out.println(s1);

    }

}
