package aug_ex040824.singleinheritance.real;

public class TestCase2 extends BaseTest{
    void testCase2(){

        startBrowser();  // baseTest
        getDataFromSQL();  //GrandBaseTest
        System.out.println(gold); //GrandbaseTest
        // Here we will write the test cases
        closeBrowser();
    }

    public static void main(String[] args) {
        new TestCase2().testCase2();
    }
}
