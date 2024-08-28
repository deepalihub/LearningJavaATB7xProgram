package aug_ex100824.poly.methodoverloading;

public class MathOperations {
    // Encapsulation
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    int add(int a, int b){
        return a+b;
    }

    // Method Overloading
    int add (int deep,int ajit,int geeta , int dhanu){
        return deep+ajit;
    }
    void add(int a ,int b, int c){
        System.out.println("Hello");
    }
    double add_double(double a, double b){
        return a+b;
    }
    String add(String a,String b){
        return a+b;
    }
    String add(String a , int b){
        return a+b;
    }
    String add(int b , String a){
        return a + b;
    }

    MathOperations(){}
    MathOperations(int a ){}
    MathOperations(int a ,int b){}
    MathOperations(int a ,int b,int c){}
    MathOperations(int a ,int b,int c,String d){}
}
