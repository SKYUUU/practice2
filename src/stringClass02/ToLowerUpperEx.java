package stringClass02;

public class ToLowerUpperEx {
    public static void main(String[] args) {

        String str1 = "Hachi is Cute";
        String str2 = "HACHI is Cute";

        System.out.println("대문자 : " + str1.toUpperCase());
        System.out.println("소문자 : " + str1.toLowerCase());

        System.out.println(str1.equals(str2));
        System.out.println(str1.equalsIgnoreCase(str2));


    }
}
