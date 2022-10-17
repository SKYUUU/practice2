package otherClass03;

public class SystemEx02 {
    public static void main(String[] args) {

        // 프로그램의 성능을 테스트 할 때 사용하는 유용한 메서드
        long sum = 0;
        long start = System.currentTimeMillis();  // 10 의 3승 분의 1초
//        long start = System.nanoTime();    // 10의 9승 분의 1초
        for (long i = 1; i < 1000000000; i++) {
            sum += i;
        }
        long end = System.currentTimeMillis();
//        long end = System.nanoTime();
        System.out.println(sum);
        System.out.println("소요된 시간(ms) : " + (end - start) + "ms");
        System.out.println("소요된 시간(s) : " + ((end - start) / 1000.0)  + "s");
    }
}
