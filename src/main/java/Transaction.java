public class Transaction implements Comparable<Transaction>{
    private String name;
    private String category;
    private String date;
    private double amount;

    public Transaction(String name, String category, String date, double amount) {
        this.name = name;
        this.category = category;
        this.date = date;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", date='" + date + '\'' +
                ", amount=" + amount +
                '}';
    }

    @Override
    public int compareTo(Transaction other) {
        return name.compareTo(other.name);
    }
}
