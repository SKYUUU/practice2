package stringClass02;

public class EqualsEx {
    public static void main(String[] args) {

        String str1 = new String("하치");
        String str2 = "하치"; // 리터럴 타입으로 대입
        String str3 = "하치";

        // == 연산자가 주소비교
        if (str1 == str2) {
            System.out.println("같은 번지의 인스턴스");
        } else System.out.println("다른 번지의 인스턴스");

        // 같은 리터럴의 경우 같은 번지를 참조
        if (str2 == str3) {
            System.out.println("같은 번지의 인스턴스");
        } else System.out.println("다른 번지의 인스턴스");

        // String 의 equals() 는 값 비교(Object 클래스의 equals() 오버라이딩)
        if (str1.equals(str2)) {
            System.out.println("같은 문자열 입니다.");
        } else System.out.println("다른 문자열입니다.");

        if (str2.equals(str3)) {
            System.out.println("같은 문자열 입니다.");
        } else System.out.println("다른 문자열입니다.");
    }
}
