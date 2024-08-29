package aug_ex110824.RealLifeex;

public class  extends BaseClass{
    @Override
    String openBrowser(String browser) {
        System.out.println("open the firefox");  //this code is only related to FireFox
        return "";
    }

    @Override
    String closeBrowser(String browser) {
        System.out.println("Closing the FireFox");  // This code is related to only FireFox
        return "";
    }

    @Override
    void takeScreenShot() {
        System.out.println("taking ScreenShot");
    }
}
