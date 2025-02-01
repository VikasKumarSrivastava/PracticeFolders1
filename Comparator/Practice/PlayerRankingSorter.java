package Comparator.Practice;

import java.util.*;

public class PlayerRankingSorter {

    public static void main(String[] args) {
        List<Player> footballTeam = new ArrayList<>();
        Player player1 = new Player(59, "John", 22);
        Player player2 = new Player(67, "Roger", 20);
        Player player3 = new Player(45, "Steven", 24);

        footballTeam.add(player1);
        footballTeam.add(player2);
        footballTeam.add(player3);

        System.out.println("Before sorting : "+footballTeam);
        PlayerRankingComparator playerRankingComparator = new PlayerRankingComparator();
        Collections.sort(footballTeam,playerRankingComparator);
        System.out.println("After sorting by rank :"+footballTeam);
    }
}
