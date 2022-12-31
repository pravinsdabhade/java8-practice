package src.com.practice.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;


// https://www.geeksforgeeks.org/stream-reduce-java-examples/
// Implementation of reduce method to get the longest String
public class ReduceDemo {
    public static void main(String[] args) {

        // creating a list of Strings
        List<String> employeeNames = Arrays.asList("ravi","kumar","ramkishan","siva");

        // The lambda expression passed to reduce() method takes two Strings and returns the longer String.
        // The result of the reduce() method is an Optional because the list on which
        // reduce() is called may be empty.
        Optional<String> logestName
                = employeeNames.stream().reduce((name1, name2) -> name1.length() > name2.length() ? name1 : name2);

        // Displaying the longest String
        logestName.ifPresent(System.out::println);

//        Notes: Many times, we need to perform operations where a stream reduces to single resultant value,
//        for example, maximum, minimum, sum, product, etc.
//        Reducing is the repeated process of combining all elements.
//        reduce operation applies a binary operator to each element in the stream where the first argument to the operator is the return value of the previous application and second argument is the current stream element.
    }
}
