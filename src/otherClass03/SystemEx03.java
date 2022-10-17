package otherClass03;

import java.util.Properties;
import java.util.Set;

public class SystemEx03 {
    public static void main(String[] args) {

        String osName = System.getProperty("os.name");
        System.out.println("현재 운영체제 : " + osName);

        String userName = System.getProperty("user.name");
        System.out.println("사용자 계정 : " + userName);

        // Properties 클래스는 Map 계열의 컬렉션. String-String 갖는다.
        // key : String, value = String
        Properties properties = System.getProperties();
        // Map 컬렉션에서 Key 만 Set 계열로 가져옴
        Set set = properties.keySet();

        System.out.println("Key                     Value");
        System.out.println("------------------------------------");
        for (Object objKey : set) {
            String key = (String) objKey;
            String value = System.getProperty(key);
            System.out.println(key + "            " + value);
        }
    }
}
