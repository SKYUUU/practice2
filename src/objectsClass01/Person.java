package objectsClass01;

import java.util.Arrays;
import java.util.Objects;

public class Person {

    int age;
    String name;
    int[] arr;

    public Person(int age, String name, int[] arr) {
        this.age = age;
        this.name = name;
        this.arr = arr;
    }

    @Override
    public int hashCode() {
//        // 하위호환 (jdk 1.8 아래 버젼)
//        return this.age + this.name.hashCode() + Arrays.toString(this.arr).hashCode();문

        // 아래와 같이 작성하면 해쉬코드 얻기가 상당히 수월함
        return Objects.hash(this.age, this.name, Arrays.toString(this.arr));
    }
}
