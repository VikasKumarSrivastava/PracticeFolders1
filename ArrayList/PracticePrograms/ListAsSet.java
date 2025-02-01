package ArrayList.PracticePrograms;
import java.util.*;
import java.util.stream.Collectors;

public class ListAsSet {

    public static void main(String[] args) {
        List<Integer> li = Arrays.asList(1,3,4,5,5,6);
        System.out.println("list is : "+li);
        System.out.println("Way 1");
        Set<Integer> hs = new HashSet<>();
        for(Integer i : li){
            hs.add(i);
        }
        System.out.println(hs);
        System.out.println("Way 2");
        Set<Integer> hs1 = new HashSet<>(li);
        System.out.println(hs1);
        System.out.println("Way 3");
        Set<Integer> hs2 = new HashSet<>();
        hs2.addAll(li);
        System.out.println(hs2);
        System.out.println("Way 4");
        Set<Integer> hs3 = li.stream().collect(Collectors.toSet());
        System.out.println(hs3);



    }
}
