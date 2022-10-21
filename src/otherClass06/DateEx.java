package otherClass06;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx {
    public static void main(String[] args) {

        // Date 크래스는 TimeStamp 기능으로 많이 사용된다.
        // 근태, 카드 사용내역, 로그 정보 등
        Date today = new Date();
        // Date 클래스는 toString() 호출하면 세계표준협정시(UTC) 형태로 출력이됨.
        System.out.println(today);

        SimpleDateFormat sDateFormat = new SimpleDateFormat("yyyy년 MM월 dd일 a hh:mm:ss");
        System.out.println(sDateFormat.format(today));
    }
}
