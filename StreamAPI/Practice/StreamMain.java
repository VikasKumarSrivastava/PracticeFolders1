package StreamAPI.Practice;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class StreamMain {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(3000);
        list.add(4000);
        list.add(5000);
        list.add(7000);

        List<Integer> ans = list.stream().filter(n->(n >3500)).collect(Collectors.toList());
        System.out.println(ans);

        Integer[] salaryList ={2500,4500,7600,3000};
        Stream<Integer> streamUsingArray = Arrays.stream(salaryList);
        System.out.println(streamUsingArray.collect(Collectors.toList()));
        /* 
        Iterator it = streamUsingArray.iterator();
        while(it.hasNext()){
            int x =(Integer) it.next();
            System.out.print( x+" ");

        }
        */
        //System.out.println();
        Stream<Integer> staticStream = Stream.of(100,-3300,2000,2500);
        System.out.println(staticStream.collect(Collectors.toList()));
        /* Filter */
        List<String> filteredName = Stream.of("Ravi","Shweta","Sunny","Pooja")
                                    .filter(s-> s.startsWith("S"))
                                    .collect(Collectors.toList());
        System.out.println(filteredName);
        /*Map */
        List<String> filteredName2 = Stream.of("Ravi","Shweta","Sunny","Pooja")
        .map(s-> s.toUpperCase())
        .collect(Collectors.toList());
        System.out.println(filteredName2);

        /*flatMap */
        List<List<String>> names=Arrays.asList(
            Arrays.asList("Sagar","is", "good"),
            Arrays.asList("Raghav","is","Cool"),
            Arrays.asList("Rahul","is","friendly"),
            Arrays.asList("Ishwar","is","spiritual")
        );

        List<String> flattenNames = names.stream()
                                         .flatMap(n->n.stream())
                                         .collect(Collectors.toList());
        System.out.println(flattenNames);

        Integer[] num = {1,2,5,6,-2,1,7,9,10,0};
        /*sorted() */
        List<Integer> sortedNumAsc  = Arrays.stream(num)
                                            .sorted()
                                            .collect(Collectors.toList());
        System.out.println(sortedNumAsc);
        // for(Integer i : num)
        //     System.out.print(i+" ");
        List<Integer> sortedNumDsc = Arrays.stream(num)
                                            .sorted((n1,n2)->n2-n1)
                                            .collect(Collectors.toList());
        System.out.println(sortedNumDsc);
        /*Peek */
        List<Integer> evenNum = Arrays.stream(num)
                                        .filter(n->n%2==0)
                                        .peek(val->System.out.print(val+" "))
                                        .collect(Collectors.toList());
        System.out.println(evenNum);
        /*mapToInt */
        List<String> numbers = Arrays.asList("2","3","4","5");
        IntStream intStream = numbers.stream().mapToInt(val->Integer.parseInt(val));
        int[] arr1 = intStream.toArray();
        for(int a:arr1){
            System.out.print(a+" ");
        }
        System.out.println();
        List<String> numbers1 = Arrays.asList("2","5","7","9");
        LongStream longStream = numbers1.stream().mapToLong(val->Long.parseLong(val));
        long[] arr2 = longStream.toArray();
        for(long a:arr2){
            System.out.print(a+" ");
        }
        List<Integer> numbers2 = Arrays.asList(11,22,33,44,55,66,77,88,99,100,101,1111111);

        long sequentialProgStartTime  = System.currentTimeMillis();
        numbers2.stream().map(val->val*val).forEach(System.out::println);
        System.out.println("Sequential total time : "+ (System.currentTimeMillis() - sequentialProgStartTime)+" ms.");

        
        long parallelProgStartTime  = System.currentTimeMillis();
        numbers2.parallelStream().map(val->val*val).forEach(System.out::println);
        System.out.println("Parallel total time : "+ (System.currentTimeMillis() - parallelProgStartTime)+" ms.");
        
        }


}
