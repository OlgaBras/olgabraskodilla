public class CashMachine {
    private int[] transactions = new int[0];
    private int size = 0;
    public void addTransactions(int transaction) {
        this.size++;
        int[] newTab = new int[this.size];
        System.arraycopy(transactions, srcPos:0, newTabewTab, destPos:0, transactiosn.length);
        newTab[this.size - 1] = transaction;
        this.transactions = newTab;

    }
    public int numberOfTransactions() {
        return size;
    }
    public int saldo() {
    int result = 0;
    for(int i=0; i<this.size; i++) {
        result = result + this.transactions[i];
    }
    return result;
    }
}
