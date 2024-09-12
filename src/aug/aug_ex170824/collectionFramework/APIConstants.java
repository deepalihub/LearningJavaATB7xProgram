package aug.aug_ex170824.collectionFramework;

public enum APIConstants {

BASE_URL("https://app.vwo.com"),
    LOGIN_PAGE("https://app.vwo.com.login"),
    DASHBOARD_PAGDE("https://app.vwo.com/dashboard"),
    CHATBOTPAGE("https://app.vwo.com/chat");


        private final String name;
        APIConstants(String name){
                 this.name = name;
            }

            public String getValue(){
                return name;
            }

    }