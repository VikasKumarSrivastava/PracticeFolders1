package Comparator.Practice;

import java.util.*;

public class PlayerAgeComparator implements Comparator<Player>{

    @Override
    public int compare(Player o1, Player o2) {
        return Integer.compare(o1.getAge(),o2.getAge());
    }
    

}
