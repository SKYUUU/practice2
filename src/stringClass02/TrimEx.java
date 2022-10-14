package stringClass02;

public class TrimEx {
    public static void main(String[] args) {

        // trim() 은 좌우 공백만 제거함, 중간에 있는 공백은 제거하는 코드를 직접 작성해야함
        String tel1 = "        02";
        String tel2 = "-123     ";
        String tel3 = "    -4567  ";

        System.out.println(tel1.trim() + tel2.trim() + tel3.trim());
    }
}
