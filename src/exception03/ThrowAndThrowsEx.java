package exception03;

public class ThrowAndThrowsEx {

    public static void main(String[] args) {

//        boolean result = false;

        try {
            findClass();
            System.out.println("클래스가 존재합니다.");

//            result = findClass();
//            if (result) {
//                System.out.println("클래스가 존재합니다.");
//            }

        } catch (ClassNotFoundException e) {
            System.out.println("클래스가 존재하지 않습니다.");
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("알수 없는 예외가 발생하였습니다.");
            // 개발자용, 배포시에는 제거나 주석처리
            e.printStackTrace();
        } finally {
            System.out.println("정상 종료합니다.");
        }
    }

    public static void findClass() throws Exception {

        Class class1 = Class.forName("java.lang.String");
        throw new Exception("강제로 예외 발생");
        // 클래스가 있다면
//        if (class1 != null) {
//            return true;
//        } else return false;
    }
}
