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
    public int numberOfPayOut() {
        int count = 0;
        for(int i=0; i<this.size; i++) {
            int transaction = this.transactions[i];
            if (transaction <0) {
                count++;
            }
        }
        return count;
    }
    public int numberOfPayIn() {
        int count = 0;
        for (int i = 0; i < this.size; i++) {
            if(this.transactions[i] > 0) {
                count++;
            }
        }
        return count;
    }
    public int sumOfPayOut() {
        int sum = 0;
        for (int i = 0; i < this.size; i++) {
            int transaction = this.transactions[i];
            if (transaction < 0) {
                sum += transaction;
            }
        }
        sum = sum * (-1);
        return sum;
    }

}
