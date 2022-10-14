package stringClass03;

public class SplitEx {
    public static void main(String[] args) {

        String str1 = "하치야,사랑해,너를,밥먹자,왜,밥을,안먹니";

        // split() : 매개변수로 정규표현식이 오며 리턴타입은 구분되어진 String[]
        String[] strArr = str1.split(",");

        for (String str: strArr) {
            System.out.println(str);
        }
    }
}
