package aug_ex100824.encap;

public class ICICIBank {
//## Encapsulation
    //- Encapsulation is a fundamental concept in object-oriented programming (OOP).
    //- Bundling of data and methods that operate on that data within a single unit.
    //- Data members should be private in nature.
    //- Methods with getter and setter only, you can access the data members / attributes.


    private String name;
    private long bal;

    public ICICIBank(String name, long bal) {
        this.name = name;
        this.bal = bal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name,boolean isAdmin) {
        if(isAdmin){
        this.name = name;
            System.out.println("Allowed");
    }else{
            System.out.println("Not Allowed");
        }
    }

    public long getBal() {
        return bal;
    }

    public void setBal(long bal,boolean isAdmin) {
        if(isAdmin){
        this.bal = bal;
            System.out.println("Allowed");
    }else{
            System.out.println("Not Allowed");
        }
    }
}
