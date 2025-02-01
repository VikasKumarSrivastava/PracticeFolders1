package MapInterface.Practice;

import java.util.*;

public class Main3 {

    public static void main(String[] args) {
        /* 
        List<Integer> list1 = new ArrayList<>();

        list1.add(10);
        list1.add(23);
        list1.add(30);

        List<Integer> list2 = new ArrayList<>();
        list2.add(40);
        list2.add(50);

        list1.addAll(list2);
        System.out.println(list1);
        System.out.println(list2);

        list1.removeIf(n->n%2==0);
        System.out.println(list1);
        */
        ArrayList<?> first = new ArrayList<>();
        ArrayList<Object> second = new ArrayList<>();
        System.out.println(first);
        System.out.println(second);
        System.out.println(first == second);
    }
}

//
/*
 * public interface Collection<E> extends Iterable<E>
 * {
 * int size();
 * boolean isEmpty();
 * boolean contains(Object o);
 * boolean add (E e);
 * boolean remove(Object o);
 * Iterator<E> iterator();
 * Object[] toArray();
 * T[] to Array(T[] arr)
 * Stream<E> stream();
 * Stream<E>parallelStream();
 * 
 * Bulk Operations
 * --------------------
 * boolean containsAll(Collection<?> c)
 * boolean addAll(Collection<? extends> c)
 * boolean removeAll(Collection<?> c)
 * boolean removeIf(Predicate<? super E> filter)
 * ....
 * }
 */