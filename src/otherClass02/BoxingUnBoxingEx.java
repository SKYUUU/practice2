package otherClass02;

public class BoxingUnBoxingEx {
    public static void main(String[] args) {
        // Boxing 코드 -> 객체화시킴
        Integer obj1 = new Integer(100);
        Integer obj2 = new Integer("100");
        Integer obj3 = Integer.valueOf(100);
        // 컴파일 시 new Integer(100) 로 바뀜
        Integer obj4 = 100;

        System.out.println("박싱 후");
        System.out.println(obj1);
        System.out.println(obj2);
        System.out.println(obj3);
        System.out.println(obj4);

        // Unboxing 코드 -> 객체를 기본값으로 바꿈
        int value1 = obj1.intValue();
        int value2 = obj2;
        int value3 = obj3;
        int value4 = obj4.intValue();

        System.out.println("언박싱 후");
        System.out.println(value1);
        System.out.println(value2);
        System.out.println(value3);
        System.out.println(value4);
    }
}
