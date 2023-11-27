import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Mike", 524, 3);
        s1.addSubject(Subject.ECM, 1);
        Student s2 = new Student("Anna", 702, 2);
        s2.addSubject(Subject.PE, 5);
        MyList<Student> list = new MyList<>();
        list.add(s1);
        list.add(s2);
        list.printStudents(list, 2);
    }
}