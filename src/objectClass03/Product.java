package objectClass03;

import java.util.Arrays;

// 클래스의 복제가 가능하게 하려면, java.lang.cloneable 인터페이스를 구현해야 한다.
public class Product implements Cloneable{

    private String id;
    private String name;
    private int price;
    private int[] arr;

    public Product(String id, String name, int price, int[] arr) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.arr = arr;
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

    @Override
    public String toString() {
        return "Product{" +
                "상품id='" + this.getId() + '\'' +
                ", 상품이름='" + this.getName() + '\'' +
                ", 상품가격=" + this.getPrice() +
                ", 배열값=" + Arrays.toString(this.arr) +
                '}';
    }

//    @Override
//    protected Object clone() throws CloneNotSupportedException {
//        return super.clone();
//    }

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
}
