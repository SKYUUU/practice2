package objectClass01;

public class ObjectEqualsEx {

    public static void main(String[] args) {
        // Object 클래그의 equals()
        // 아래 두 instance 는 주소가 다르다
        Object object1 = new Object();
        Object object2 = new Object();

        // Object 클래스의 equals()는 메모리주소 비교
        boolean result1 = object1.equals(object2);
        boolean result2 = (object1 == object2);
        System.out.println(object1);
        System.out.println(object2);
        System.out.println("equals() : " + result1);
        System.out.println("== 연산자 : " + result2);

    }
}
