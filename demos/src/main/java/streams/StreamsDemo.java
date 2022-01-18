package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsDemo {

    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(new Employee("John Doe", 1970),
                new Employee("Jack Doe", 1980),
                new Employee("Jane Doe", 1990));

        // Adjuk vissza az 1990-nél régebben született
        // alkalmazottak nevét nagybetűkkel

//        List<String> names = new ArrayList<>();
//        for (Employee employee: employees) {
//            if (employee.getYearOfBirth() < 1990) {
//                names.add(employee.getName());
//            }
//        }

        List<String> names = employees
                .stream()
                .filter(employee -> employee.getYearOfBirth() < 1990)
                .map(employee -> employee.getName())
                .map(name -> name.toUpperCase())
                .collect(Collectors.toList());
        System.out.println(names);
    }
}
