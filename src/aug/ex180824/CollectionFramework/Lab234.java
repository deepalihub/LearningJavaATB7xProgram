package aug.ex180824.CollectionFramework;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lab234 {
    public static void main(String[] args) {

        List<String> mylist = new ArrayList();
        mylist.add("deep");
        mylist.add("geet");
        mylist.add("neet");
        System.out.println("To print Arraylist 1   ");

        for(String str : mylist){
            System.out.println(str);
        }

        System.out.println("To print Arraylist 2   ");

        for( int i=0; i< mylist.size(); i++){
            System.out.println(mylist.get(i));
        }

        System.out.println("To print Arraylist 3   ");

        Iterator<String> its = mylist.iterator();
        while(its.hasNext()){
            System.out.println(its.next());
        }

    }
}
