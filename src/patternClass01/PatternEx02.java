package patternClass01;

import java.util.Vector;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternEx02 {
    public static void main(String[] args) {

        String[] data = { "bat", "baby", "bonus", "ca", "cb", "c,", "car",
                            "com", "date", "zoo", "disc"};
        // 소문자 c 로 시작하는 영어단어나 문장을 패턴으로 정의
        // Pattern pattern = Pattern.compile("c[a-z]*");
        String pattern = "c[a-z]*";

        Vector<String> vStrings = new Vector<String>();

        for(String str : data) {
            boolean result = Pattern.matches(pattern, str);
            if(result) {
                System.out.println(str);
                vStrings.add(str);
            }

//            Matcher matcher = pattern.matcher(str);
//            // 정의한 패턴과 일치하는가?
//            if(matcher.matches()) {
//                System.out.println(str);
//                vStrings.add(str);
//            }
        }

        System.out.println();
        System.out.println("c로 시작하는 소문자 영단어 : " + vStrings.toString());

    }
}
