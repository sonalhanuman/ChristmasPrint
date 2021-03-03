import java.util.Collections;
import java.util.List;

public class TransactionSorter {
    public static List<Transaction> sort(List<Transaction> transactions) {
        Collections.sort(transactions);
        return transactions;
    }
}
