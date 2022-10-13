package objectClass01;

public class StudentEx {
    public static void main(String[] args) {

        Student student1 = new Student(10, "하치", new int[] {100, 90});
        Student student2 = new Student(10, "하치", new int[] {100, 100});

        System.out.println(student1.equals(student2));
    }
}
