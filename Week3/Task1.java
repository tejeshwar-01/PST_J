import java.util.*;
import java.util.stream.*;

class Student {
    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
}

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // number of students
        int n = sc.nextInt();

        List<Student> students = new ArrayList<>();

        // input student data
        for (int i = 0; i < n; i++) {
            String name = sc.next();
            int marks = sc.nextInt();
            students.add(new Student(name, marks));
        }

        // top k students
        int k = sc.nextInt();

        List<String> topStudents = students.stream()
                .sorted(Comparator
                        .comparingInt((Student s) -> s.marks).reversed()
                        .thenComparing(s -> s.name))
                .limit(k)
                .map(s -> s.name)
                .collect(Collectors.toList());

        System.out.println(String.join(" ", topStudents));

        sc.close();
    }
}
