package stringClass02;

public class ValueOfEx {
    public static void main(String[] args) {

        String str1 = String.valueOf(true);
        System.out.println(str1);

        // valueOf() 메서드는 GUI 프로그램에서 자주 등장함
        String str2 = String.valueOf(777.888);
        System.out.println(str2);
    }
}
