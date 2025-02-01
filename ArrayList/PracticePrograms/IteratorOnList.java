package ArrayList.PracticePrograms;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorOnList {

    public static void main(String[] args) {
        List<Integer> li = new ArrayList<>();
        List<Integer> even = new ArrayList<>();
        List<Integer> odd = new ArrayList<>();
        for(int i = 1; i<10;i++)
            li.add(i);
        li.forEach(x-> System.out.print(x+" "));
        System.out.println();
        Iterator<Integer> it = li.iterator();
        while(it.hasNext()){
            Integer x = (Integer)it.next();
            if(x%2==0)
                even.add(x);
            else
                odd.add(x);         
        }
        System.out.println("Even nos are:" +even);
        System.out.println("Odd nos are:" +odd);
    }

}
