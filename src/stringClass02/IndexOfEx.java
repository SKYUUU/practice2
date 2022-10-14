package stringClass02;

public class IndexOfEx {

    public static void main(String[] args) {

        // indexOf 메서드는 찾기 기능을 할 때 자주 쓰임
        String str = "오늘은 하치의 컨디션이 좋네요";
        int index = str.indexOf("하치");
        System.out.println("하치 시작 방 번호 : " + index);

        // 하치라는 문자열이 포함되어 있으면...
        if(str.indexOf("하치") != -1) {
            System.out.println("하치와 관련된 내용입니다");
        } else System.out.println("하치와 관련없는 내용입니다");
    }
}
