package otherClass05;

import java.util.StringTokenizer;

public class SplitStringTokenizerEx {
    public static void main(String[] args) {

        String data = "hachi gemma fox a b c d e f g h i j k l m n";

//        long start = System.nanoTime();

        // split() 는 구분자를 공백으로 주면 데이터가 공백을 다수 포함하고 있다면 공백도 토큰으로 인식함
        String[] result = data.split(" ");
        for (String str : result) {
            System.out.println(str);
        }
//        long end = System.nanoTime();
//        System.out.println("걸린 시간 : " + (end-start) + "ns");
        System.out.println("토큰 개수 : " + result.length);
        System.out.println("-------------------------------------");

        // StringTokenizer 는 구분자를 공백으로 줄 경우 구분자 외의 공백을 토큰으로 인식하지 않음

        StringTokenizer st = new StringTokenizer(data, " ");
//        start = System.nanoTime();
        while(st.hasMoreTokens()) {
            System.out.println("남은 토큰수 : " + st.countTokens());
            String str = st.nextToken();
            System.out.println(str);
        }
//        end = System.nanoTime();
//        System.out.println("걸린 시간 : " + (end-start) + "ns");
    }
}
