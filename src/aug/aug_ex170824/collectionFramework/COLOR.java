package aug.aug_ex170824.collectionFramework;

public enum COLOR {
    RED("#ff0000"),
    GREEN("#f0d0d0d"),
    BLUE("#f0d0d0d");

    private final String hexValue;

    COLOR(String hexValue){
        this.hexValue = hexValue;
    }

    public String getValue(){
        return hexValue;
    }
}
