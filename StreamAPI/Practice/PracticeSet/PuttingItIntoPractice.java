package StreamAPI.Practice.PracticeSet;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import static java.util.Comparator.comparing;

public class PuttingItIntoPractice {
    public static void main(String[] args) {
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario","Milan");
        Trader alan = new Trader("Alan","Cambridge");
        Trader brian = new Trader("Brian","Cambridge");
		
		List<Transaction> transactions = Arrays.asList(
            new Transaction(brian, 2011, 300), 
            new Transaction(raoul, 2012, 1000),
            new Transaction(raoul, 2011, 400),
            new Transaction(mario, 2012, 710),	
            new Transaction(mario, 2012, 700),
            new Transaction(alan, 2012, 950)
        );
        /* 1. Find all txns in 2011 and sort by value */
        List<Transaction> allTxn = transactions.stream()
                                .filter(n->n.getYear()==2011)
                                .sorted(comparing(Transaction::getValue))
                                .collect(Collectors.toList());
        System.out.println(allTxn);
        /* 2. Unique city where the traders work */
        List<String>  uniqueCity = transactions.stream()
                                               .map(txn -> txn.getTrader().getCity())
                                               .distinct()
                                               .collect(Collectors.toList());
        System.out.println(uniqueCity);

        /* 3. Find all traders from Cambridge and sort them by name */
        List<Trader> tradersFromCambridge = transactions.stream()
                                                        .map(Transaction::getTrader)
                                                        .filter(trader->trader.getCity().equals("Cambridge"))
                                                        .distinct()
                                                        .sorted(comparing(Trader::getName))
                                                        .collect(Collectors.toList());
        System.out.println(tradersFromCambridge);

        /* 4. Return a string of all traders names sorted alphabetically */
        String tradName = transactions.stream()
                                  .map(txn->txn.getTrader().getName())
                                  .distinct()
                                  .sorted()
                                  .reduce(" ",(a,b)->a+b);
        System.out.println(tradName);
        /* 5. Find if any traders based in Milan*/
        boolean milanBased = transactions.stream()
                                         .anyMatch(txn-> txn.getTrader().getCity().equals("Milan"));
        System.out.println(milanBased);
        
        /* 6. Print all transactions values from the traders living in Cambridge */
        List<Integer> allTransactionsCam = transactions.stream()
                                                           .filter(txn->txn.getTrader().getCity().equals("Cambridge"))
                                                           .map(traders -> traders.getValue())
                                                           .collect(Collectors.toList());
        System.out.println(allTransactionsCam);

        /* 7. What's the highest value of all the transaction */
        int highVal = transactions.stream()
                          .map(txn -> txn.getValue())
                          .reduce(0,Integer::max);
        System.out.println(highVal);

        /* 8. Find the transaction with the smallest value */
        Optional<Integer> smallestVal = transactions.stream()
                                      .map(txn->txn.getValue())
                                      .reduce(Integer::min);
        System.out.println(smallestVal.get());
    }
}
