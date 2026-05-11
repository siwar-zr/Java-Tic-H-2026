package streamApi;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Demo {
    public static void main(String[] args) {

        /*List<Integer> nums = Arrays.asList(4,5,7,2,3,6);
        System.out.println(nums);

        for(int i = 0; i < nums.size() ; i++){
            System.out.println(nums.get(i));
        }

        for (int n : nums){
            System.out.println(n);
        }
        Consumer<Integer> con = n -> System.out.println(n);

        nums.forEach(n -> System.out.println(n));
        nums.forEach(con);

        int sum = 0;
        for (int n : nums){
            if (n%2 == 0){
                n = n*2;
                sum = sum + n;
            }
        }

        System.out.println(sum);
        System.out.println(nums);*/

        //Avec StreamApi

        List<Integer> nums = Arrays.asList(4,5,7,2,3,6);

        Stream<Integer> s1 = nums.stream();

        //Predicate<Integer> pr = n -> n%2 == 0;
        //Stream<Integer> s2 = s1.filter(pr);

        Stream<Integer> s2 = s1.filter(n -> n%2 == 0);

        //Function<Integer, Integer> fn = n -> n*2;
        //Stream<Integer> s3 = s2.map(fn);

        Stream<Integer> s3 = s2.map(n -> n*2);

        int result = s3.reduce(0, (c,e) -> c+e);


        System.out.println(result);
        //s3.forEach(n -> System.out.println(n));
        //s1.forEach(n -> System.out.println(n));

        int result1 = nums.stream()
                .filter(n -> n%2 == 0)
                .map(n -> n*2)
                .reduce(0, (c,e) -> c+e);

        Stream<Integer> sortedValues = nums.stream()
                .filter(n -> n%2 == 1)
                .sorted();
        sortedValues.forEach(n -> System.out.println(n));

        List<Integer> nums2 = nums.stream()
                .filter(n -> n%2 == 1)
                .sorted()
                .toList();

        System.out.println(nums2);





    }
}
