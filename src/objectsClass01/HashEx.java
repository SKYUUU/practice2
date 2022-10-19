package objectsClass01;

public class HashEx {

    public static void main(String[] args) {
        Person person1 = new Person(15, "하치", new int[] {20, 6});
        Person person2 = new Person(15, "하치", new int[] {20, 6});

        int[] arr1 = new int[] {20, 6};
        int[] arr2 = new int[] {20, 6};

        // 배열의 해쉬코드가 다른 이유는 new 연산자 때문
        System.out.println(arr1.hashCode());
        System.out.println(arr2.hashCode());

        System.out.println(person1.hashCode());
        System.out.println(person2.hashCode());
    }
}
