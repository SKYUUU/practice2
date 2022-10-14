package stringClass02;

public class ReplaceEx {
    public static void main(String[] args) {

        // replace() 는 문자열을 대체하는 메서드
        String oldstr = "하치는 귀여운 고양이입니다.";
        String newstr = oldstr.replace("하치", "HACHI");
        System.out.println(newstr);
        System.out.println(newstr.toString());

        System.out.println(oldstr.hashCode());
        System.out.println(newstr.hashCode());
    }
}
