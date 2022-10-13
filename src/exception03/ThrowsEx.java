package exception03;

public class ThrowsEx {

    public static void main(String[] args) {

        // main() 에서 method1() 을 호출하므로 여기서 예외처리를 해야함
        try {
            method1();
        } catch (Exception e) {
            System.out.println("예외발생, 0으로 나눌 수 없습니다.");
        }
    }
    // throws 는 메서드 선언부 끝에 작성하며 호출한 곳에서 반드시 예외를 처리해야함
    public static void method1() throws Exception {
        method2();
    }

    public static void method2() throws Exception {
        System.out.println(10 / 0); // 산술예외(실행예외)
    }
}
