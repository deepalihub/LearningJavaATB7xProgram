package aug.aug_ex170824;

public interface Lab200 {
    public static void main(String[] args) {
        APIAutomation a = new APIAutomation();
        // SIB--- call 1 time
        // IIB ---when obj is created
    }
}

class APIAutomation{

    static{
        // Write a code load the data from my SQL
        System.out.println("Loaded the data from my SQL");
    }

    {
        // Write a code to load the data from CSV
        System.out.println("Loaded the data from CSV");
    }
}