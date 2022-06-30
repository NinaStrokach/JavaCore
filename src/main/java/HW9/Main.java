package HW9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Mike", Arrays.asList(new Course("Math"), new Course("Biology"),
                new Course("English"))));
        students.add(new Student("Mishel", Arrays.asList(new Course("Math"), new Course("Geography"),
                new Course("Engineering"), new Course("Sociology"))));
        students.add(new Student("Anna", Arrays.asList(new Course("Physics"), new Course("Biology"),
                new Course("English"), new Course("Chemistry"))));

        System.out.println(students.stream()
                .map(s -> s.getCourses())
                .flatMap(f -> f.stream())
                .collect(Collectors.toSet()));

        System.out.println(students.stream()
                .sorted((s1, s2) -> s2.getCourses().size() - s1.getCourses().size())
                .limit(2)
                .collect(Collectors.toList()));

        Course course = new Course("English");
        System.out.println(students.stream()
                .filter(s -> s.getCourses().contains(course))
                .collect(Collectors.toList()));
    }
}
