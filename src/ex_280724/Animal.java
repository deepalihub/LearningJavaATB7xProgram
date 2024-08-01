package ex_280724;

public class Animal {

    String name = "lol";
    String color;

    void walk(){}
    void talk(){}

    public static void main(String[] args) {
        Animal animalRef = null;
        Animal animalRef2 = new Animal();
        Animal animalRef3 = new Animal();
        Animal animalRef4 = animalRef2;
        System.out.println(animalRef3.name);
    }
}
