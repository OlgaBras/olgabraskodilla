public class Bank {
    private CashMachine[] cashMachines = new CashMachine[0];
    private int size = 0;

    public void addCashMachine(CashMachine cashMachine) {
        this.size++;
        CashMachine[] newTab = new CashMachine[][ this.size];
        System.arraycopy(cashMachines, srcPos:0, newTabewTab, destPos:0, cashMachines.length);
        newTab[this.size - 1] = cashMachine;
        this.cashMachines = newTab;
    }

    public int saldo() {
        int sum = 0;
        for (int i = 0; i < this.size; i++) {
            sum = sum + this.cashMachines[i].saldo();
        }
        return sum;
    }
    public int numberOdPayOut() {
        int count = 0;
        for (int i= 0; i < this.size; i++) {
            count = count + this.cashMachines[i].numberOfPayOut();

        }
        return count;
    }
    public int numberOfPayIn() {
        int count = 0;
        for (int i = 0; i < this.size; i++) {
            count +=this.cashMachines[i].numberOfPayIn();
            count +=count + this.cashMachines[i].numberOfPayIn();
        }
        return count;
    }
    public int sumOfPayOut() {
        int sum = 0;
        for (int i = 0; i < this.size; i++) {
            sum +=this.cashMachines[i].sumOfPayOut();

        }
        return sum;

    }
    public double averageOfPayOut() {
        int sum = this.sumOfPayOut();
        int count = this.sumOfPayOut();
        return sum/count;

    }
    public int sumOfPayIn() {
        int sum = 0;
        for (int i = 0; i < this.size; i++) {
            int transaction = this.transaction[i];
            if (transaction > 0) {

            }
        }
        return sum;
    }
    public int sumOfPayIn() {
        int sum = 0;
        for (int i = 0; i < this.size; i++) {
            sum += this.cashMachines[i].sumOfPayIn();
        }
        return sum;

    }
    public double averageOfPayIn() {
        int sum = this.sumOfPayIn();
        double count = this.numberOfPayIn();
        return sum/count;


    }
}