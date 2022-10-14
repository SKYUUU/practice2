package objectClass04;

import java.util.Arrays;

// 클래스의 복제가 가능하게 하려면, java.lang.cloneable 인터페이스를 구현해야 한다.
public class Product implements Cloneable{

    private String id;
    private String name;
    private int price;
    private int[] arr;
    private Apple apple;

    public Product(String id, String name, int price, int[] arr, Apple apple) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.arr = arr;
        this.apple = apple;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int[] getArr() {
        return this.arr;
    }

    public Apple getApple() {
        return this.apple;
    }

    @Override
    public String toString() {
        return "Product{" +
                "상품id='" + this.getId() + '\'' +
                ", 상품이름='" + this.getName() + '\'' +
                ", 상품가격=" + this.getPrice() +
                ", 배열값=" + Arrays.toString(this.arr) +
                ", Apple값=" + this.apple.price +
                '}';
    }

    public Product getProduct() {
        Product cloned = null;
        try {
            // 얕은 복제가 여기서 일어남(참조변수의 값들은 번지 공유)
            cloned = (Product) this.clone();    // 여기서의 clone() 는 Object 클래스
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return cloned;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        // 먼저 얕은 복제를 호출(기본형 타입)
        Product cloned = (Product) super.clone();   // Object 클래스의 clone() 호출
        // 참조타입들을 복제하는 코드
        cloned.arr = Arrays.copyOf(this.arr, this.arr.length); // 배열 복제
        cloned.apple = new Apple(this.apple.price);

        return cloned;
    }
}
