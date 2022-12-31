package src;

import src.com.practice.model.Employee;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee(1, "Pavan", 20000.0, "Nagpur"),
                new Employee(4, "Asha", 47000.0, "Delhi"),
                new Employee(8, "Raj", 67000.0, "Mumbai"),
                new Employee(302, "Shiva", 54000.0, "Pune"),
                new Employee(101, "Ankur", 10000.0, "Mumbai"),
                new Employee(5, "Sharmila", 7000.0, "Mumbai"));
//        employees.forEach(System.out::println);

        // Question1: print the all employees which belongs to the city using java8
        Map<String, List<Employee>> map = employees.stream().collect(Collectors.groupingBy(Employee::getCity));

        map.forEach((key, value ) -> System.out.println("city: "+key+" Employees: "+ value));

        System.out.println("****************************************************************************************************");

        // Question2: Multiple the elements in array using simple for loop and using java8 provided features.
        List<Integer> listOfNumbers = Arrays.asList(1, 2, 3, 4, 5);
        Integer multiplyValue = 1;
        for (Integer num : listOfNumbers) {
            multiplyValue *= num;
        }

        System.out.println("Arrays Multiplication using simple for loop: " + multiplyValue);

        Optional<Boolean> output = Optional.of(listOfNumbers.stream().reduce((a, b) -> a * b).isPresent());
        if (output.isPresent()) {
            System.out.println("Arrays Multiplication using java8: " + output.get());
        } else {
            System.out.println("Empty Array/List");
        }
        System.out.println("****************************************************************************************************");
    }
}
