package stringClass02;

public class SubStringEx {
    public static void main(String[] args) {

        String phoneNum = "01043219876";

        // subString() 문자열을 잘라내어 String 으로 반환
        String str1 = phoneNum.substring(3);
        System.out.println(str1);

        String str2 = phoneNum.substring(0, 3);
        System.out.println(str2);
    }
}
