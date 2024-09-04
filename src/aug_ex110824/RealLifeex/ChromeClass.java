package aug_ex110824.RealLifeex;

public class ChromeClass extends BaseClass {
    @Override
    String openBrowser(String browser) {
        System.out.println("open the Browser"); // this code is related to chrom only
        return "";
    }

    @Override
    String closeBrowser(String browser) {
        System.out.println("Closing the browser");  // thic code is related to only chrom
        return "";
    }

    @Override
    void takeScreenShot() {
        System.out.println("Taking ScreenShot");
    }
}
