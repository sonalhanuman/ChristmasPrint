import org.junit.Test;


import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class TransactionSorterTest {
    @Test
    public void sortWith1TransactionShouldReturnListWith1Transaction() {
        //Arrange
        List<Transaction> transactions = new ArrayList<>();
        Transaction transaction = new Transaction("Sonal", "Food", "2021/03/03", 15.00);
        transactions.add(transaction);
        List<Transaction> expectedTransactions = new ArrayList<>();
        expectedTransactions.add(transaction);
        //Act
        var transactionSorted = TransactionSorter.sort(transactions);
        //Assert
        assertEquals(expectedTransactions, transactionSorted);
    }

    @Test
    public void sortWith2TransactionsShouldReturnTransactionsSortedByName() {
        List<Transaction> transactions = new ArrayList<>();
        Transaction transaction1 = new Transaction("Sonal", "Food", "2021/03/03", 15.00);
        Transaction transaction2 = new Transaction("David", "Food", "2021/03/03", 15.00);
        transactions.add(transaction1);
        transactions.add(transaction2);
        List<Transaction> expectedTransactions = new ArrayList<>();
        expectedTransactions.add(transaction2);
        expectedTransactions.add(transaction1);

        var transactionSorted = TransactionSorter.sort(transactions);

        assertEquals(expectedTransactions, transactionSorted);
    }

    @Test
    public void sortWith3TransactionsShouldReturnTransactionsSortedByNameThenCategory() {
        List<Transaction> transactions = new ArrayList<>();
        Transaction transaction1 = new Transaction("Sonal", "Gadget", "2021/03/03", 25.00);
        Transaction transaction2 = new Transaction("David", "Food", "2021/03/03", 15.00);
        Transaction transaction3 = new Transaction("Sonal", "Food", "2021/03/03", 15.00);
        transactions.add(transaction1);
        transactions.add(transaction2);
        transactions.add(transaction3);
        List<Transaction> expectedTransactions = new ArrayList<>();
        expectedTransactions.add(transaction2);
        expectedTransactions.add(transaction3);
        expectedTransactions.add(transaction1);

        var transactionSorted = TransactionSorter.sort(transactions);

        assertEquals(expectedTransactions, transactionSorted);
    }
}
