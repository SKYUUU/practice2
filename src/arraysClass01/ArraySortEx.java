package arraysClass01;

import java.util.Arrays;

// 사용자 정의 클래스는 정렬을 하기 위해서 Comparable 인터페이스를 구현해야함
class Person implements Comparable<Person> {

    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Person o) {
        return this.age - o.age;
//        return this.name.compareTo(o.name);   // 이름 순 정렬
    }
}

public class ArraySortEx {
    public static void main(String[] args) {

        Person person1 = new Person("하치", 15);
        Person person2 = new Person("황구", 5);
        Person person3 = new Person("피구", 6);
        Person person4 = new Person("딱지", 3);
        Person person5 = new Person("점구", 4);

        Person[] persons = {person1, person2, person3, person4, person5};
        Arrays.sort(persons);
        // 배열검색(binarySearch) 는 반드시 정렬 후
        int index = Arrays.binarySearch(persons, person2);
        System.out.println("person2 인스턴스가 있는 인덱스 : " + index + ", 이름 : " + person2.name);

        for(Person person : persons){
            System.out.println("이름 : " + person.name + ", 나이 : " + person.age);
        }
//        System.out.println(Arrays.toString(persons));

        // 기본형 타입과 String 클래스는 기본적으로 오름차순 정렬이 이루어진다.
        int[] arr = {55, -10, -9, 0, 100};

        Arrays.sort(arr);
        System.out.println("기본형 타입 소팅후 : " + Arrays.toString(arr));

        String[] names = new String[] {"하치", "망고", "황구", "딱지"};
        Arrays.sort(names);
        System.out.println("String 형 타입 소팅 후 : " + Arrays.toString(names));
    }
}
