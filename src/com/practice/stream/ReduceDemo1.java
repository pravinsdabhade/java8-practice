package src.com.practice.stream;

import java.util.Arrays;
import java.util.Optional;

// Implementation of reduce method to get the combined string.
public class ReduceDemo1 {

    public static void main(String[] args) {
        String[] array = {"geeks", "for", "geeks"};

        Optional<String> combineString = Arrays.stream(array).reduce((str1, str2) -> str1 + "-" + str2);

        // Displaying the combined string.
        if (combineString.isPresent()) {
            System.out.println(combineString.get());
        }
        System.out.println("************************************************************");

        // Implementation of reduce method to get the sum of all elements.
        Integer[] numbers= {0,-4,5,2,1,3};

        Optional<Integer> sum = Arrays.stream(numbers).reduce((n1, n2)->n1+n2);
        if(sum.isPresent()){
            System.out.println(sum.get());
        }
    }
}
