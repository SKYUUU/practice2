package patternClass01;

import java.util.regex.Pattern;

public class PatternEx01 {

    public static void main(String[] args) {
        // 010, 02 로 시작하는 휴대폰번호나 서울지역 전화번호를 패턴으로 정의
        String pattern = "(010|02)-\\d{3,4}-\\d{4}";
        String phoneNum = "010-6677-1234";
        String seoulNum = "02-677-1234";

        // boolean result = Pattern.matches(pattern, phoneNum);
        boolean result = Pattern.matches(pattern, seoulNum);
        if(result) {
            System.out.println("전화번호 양식이 맞습니다.");
        } else {
            System.out.println("전화번호 양식이 맞지 않습니다. 다시 입력해주세요.");
        }

        // 이메일 양식을 검증하는 방법
        String email = "\\w+@\\w+\\.\\w+(\\.\\w+)";
        String emailData = "hachi@gongdeok.mapo.seoul";

        boolean emailResult = Pattern.matches(email, emailData);
        if(emailResult) {
            System.out.println("이메일 양식이 맞습니다.");
        } else {
            System.out.println("이메일 양식이 맞지 않습니다. 다시 입력해주세요.");
        }
    }
}
