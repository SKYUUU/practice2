package otherClass01;

public class StringBuilderEx {
    public static void main(String[] args) {

        // StringBuilder, StringBuffer 클래스는 버퍼(임시저장메모리)를 이용하기 때문에
        // 새로운 인스턴스가 생성되는 것이 아니라 하나의 인스턴스를 이용
        StringBuilder stb = new StringBuilder("HACHI");
        System.out.println(stb.hashCode());
        stb.append("Love");

        System.out.println(stb);
        System.out.println(stb.hashCode());

        stb.insert(1, "나");
        System.out.println(stb);

        stb.insert(1, 100);
        System.out.println(stb);

        stb.setCharAt(0, 'T');
        System.out.println(stb);

        stb.reverse();
        System.out.println(stb);

        stb.delete(0, 3);
        System.out.println(stb);

        int length = stb.length();
        System.out.println("총 문자수 : " + length);
    }
}
