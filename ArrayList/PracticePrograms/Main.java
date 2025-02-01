package ArrayList.PracticePrograms;

import java.util.ArrayList;
import java.util.Iterator;

public class Main{
    public static void main(String[] args) {
        int size = 10;
        ArrayList<Integer> arr = new ArrayList<>(size);

       for(int i = 0;i<size;i++){
        arr.add(i);
       }

       System.out.println(arr);

       arr.remove(1);
       System.out.println(arr);

       for(Integer i : arr){
        System.out.print(i+" ");
       }
       System.out.println();

       ArrayList<String>arr2 = new ArrayList<>();
       arr2.add("Geeks");
       arr2.add("Geeks");
       arr2.add("Adda bazi");
       arr2.add("Rai");
       System.out.println(arr2);
       arr2.add(1, "for");
       System.out.println(arr2);

       arr2.remove("for");
       System.out.println(arr2);
       arr2.remove(1);
       System.out.println(arr2);
       arr2.set(0,"Xmas");
       System.out.println(arr2);

       ArrayList < Integer> lst = new ArrayList<>();

       lst.add(1);

       lst.add(2);

     //Printing Statement 
       System.out.println(lst.toArray()[0]);

         ArrayList<Object> lst2 = new ArrayList<>();

        lst2.add(1);

        lst2.add(2);

        Iterator<Object> it2 = lst2.iterator();

        System.out.println(it2.next());

    }
}
