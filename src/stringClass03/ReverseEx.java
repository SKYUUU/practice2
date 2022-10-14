package stringClass03;

public class ReverseEx {
    public static void main(String[] args) {

        String str = "하치야안녕";
        String reverse = "";
        int count = 0;

        String r = reverseString(str);
        System.out.println("reverseString() 호출 후 : " + r);

        count = str.length();
        System.out.println("문자열 길이 : " + count);

        // for 문 사용
        for (int i = 0; i < count; i++) {
            reverse += str.charAt(count - (i + 1));
            System.out.println(reverse);
            System.out.println(reverse.hashCode());
        }
        System.out.println("역순출력 : " + reverse);
    }
    // StringBuilder 사용
    public static String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }
}
