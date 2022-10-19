package objectsClass01;

import java.util.Comparator;
import java.util.Objects;

public class CompareEx {

    // 중첩클래스(정적멤버클래스)
    static class Student {
        int sno;
        String name;

        public Student (int sno, String name) {
            this.sno = sno;
            this.name = name;
        }
    }

    static class StudentComparator implements Comparator<Student> {
        // name(String) 으로 비교
        @Override
        public int compare(Student o1, Student o2) {
            if (o1.name.compareTo(o2.name) < 0)
                return -1;
            else if (o1.name.compareTo(o2.name) == 0)
                return 0;
            else
                return 1;
        }
    }


    public static void main(String[] args) {

        Student student1 = new Student(1, "하치");
        Student student2 = new Student(1, "하치");
        Student student3 = new Student(3, "망고");

        // 비교자 (Comparator<T> 인터페이스를 익명 구현 객체로 대입)
//        int result = Objects.compare(student1, student2, new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
////                if (o1.sno < o2.sno)
////                    return -1;
////                else if (o1.sno == o2.sno)
////                    return 0;
////                else
////                    return 1;
//                return o1.sno - o2.sno;
//            }
//        });

        int result = Objects.compare(student1, student3, new StudentComparator());

        if (result > 0) {
            System.out.println("o1.sno 가 큽니다");
        } else if (result == 0) {
            System.out.println("o1.sno 와 o2.sno 가 같습니다.");
        } else {
            System.out.println("o2.sno 가 큽니다.");
        }
    }
}
