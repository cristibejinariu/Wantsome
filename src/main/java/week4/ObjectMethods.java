package week4;

import java.util.Locale;
import java.util.Objects;

public class ObjectMethods {
    public static void main(String[] args) {

        String a = "abc";
        String b = "ABC".toLowerCase();
        System.out.println(a==b);

        System.out.println("cu equals: " + a.equals(b));

        MyClass obj1 = new MyClass();
        MyClass obj2 = new MyClass();
        System.out.println(obj1.equals(obj2));

        System.out.println("============");
        Student john = new Student("John");
        Student mark = new Student("Mark");
        Student john2 = new Student("John");
        Student jill = null;
        System.out.println(john.equals(mark));
        System.out.println(john.equals(john2));
        System.out.println(john.hashCode() == john2.hashCode());
        System.out.println(john2.equals(jill));
        System.out.println(Objects.equals(jill, john2));

        int i = 0;
        Integer j = i;
        int k = j + 2;
        int k2 = j.intValue() + 2;
    }
}
