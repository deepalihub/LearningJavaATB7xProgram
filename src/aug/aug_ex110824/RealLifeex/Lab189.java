package aug.aug_ex110824.RealLifeex;

public class Lab189 {
    public static void main(String[] args) {
        ChromeClass c1 = new ChromeClass();
        c1.openBrowser("chrome");
        c1.closeBrowser("chrome");

        FireFox f1 = new FireFox();
        f1.openBrowser("ff");
        f1.closeBrowser("ff");
        f1.takeScreenShot();
    }
}
