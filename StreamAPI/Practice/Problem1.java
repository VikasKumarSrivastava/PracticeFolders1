package StreamAPI.Practice;

import java.util.Arrays;
import java.util.List;
import static java.util.stream.Collectors.toList;

public class Problem1 {

    public static void main(String[] args) {
        List<Integer> num1  = Arrays.asList(1,2,3);
        List<Integer> num2  = Arrays.asList(3,4);

        List<int[]> pairs = num1.stream()
                                .flatMap(i->num2.stream()
                                                .map(j->new int[]{i,j})
                                        )
                                .collect(toList());
        pairs.forEach(pair -> System.out.println("(" + pair[0] + ", " + pair[1] + ")"));
    }
}
