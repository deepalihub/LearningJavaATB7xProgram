package aug.aug_ex110824.exLoan;

public class Lab188 {
    public static void main(String[] args) {
        Son s1 = new Son();
        s1.loan50K();

        Father f1 = new Son();   // dynamic Dispatch
        f1.loan25K();
        f1.loan50K();
    }
}
