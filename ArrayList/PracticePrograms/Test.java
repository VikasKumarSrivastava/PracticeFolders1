package ArrayList.PracticePrograms;

import java.util.*;

public class Test {

    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayDeque<>();
        Set<Integer> treeSet = new TreeSet<>();
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(15);
        list.add(20);

        queue.add(12);
        queue.add(16);
        queue.add(21);

        treeSet.add(120);
        treeSet.add(160);
        treeSet.add(25);

        Object []arr = list.toArray();

        for(Object o:arr){
            System.out.println(o +" ");
        }

        Object []arr2 = queue.toArray();

        for(Object o:arr2){
            System.out.println(o +" ");
        }

        Object []arr3 = treeSet.toArray();

        for(Object o:arr3){
            System.out.println(o +" ");
        }

    }
}
