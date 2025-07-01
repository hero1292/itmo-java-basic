package itmo.java.basic.homework9.Task1;

import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;

class Utils {
    public static <T> Collection<T> removeDuplicates(Collection<T> collection) {
        return new LinkedHashSet<>(collection);
    }
}

public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ann", "Bob", "Ann", "Tom", "Bob");
        Collection<String> uniqueNames = Utils.removeDuplicates(names);
        System.out.println(uniqueNames);

        List<Integer> numbers = Arrays.asList(2, 5, 2, 8, 2, 8, 8);
        Collection<Integer> uniqueNumbers = Utils.removeDuplicates(numbers);
        System.out.println(uniqueNumbers);
    }
}
