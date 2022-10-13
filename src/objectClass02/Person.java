package objectClass02;

import java.util.Objects;

public class Person {

    private String name;
    private int age;

    public Person (String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    // hash 시리즈들은 동등객체를 판단하기 위해서 1차적으로 hashcode() 호출
    @Override
    public int hashCode() {
        System.out.println("hashcode() override");
//        return this.name.hashCode() + this.age;
        return Objects.hash(this.name, this.age);
    }

    // 2차적으로 equals()를 통해 값이 같은지 확인
    @Override
    public boolean equals(Object obj) {
        System.out.println("equals() override");
        if (obj instanceof Person) {
            Person person = (Person) obj;
            if ((this.name.equals(person.name)) && (this.age == person.age)) {
                return true;
            }
        }
        return false;
    }

    // 객체의 주소보다 의미있는 데이터를 출력하게끔 toString() 오버라이드
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
