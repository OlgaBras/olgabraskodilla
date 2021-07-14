public class Bank  {
    private CashMachine[] cashMachines = new CashMachine[0];
    private int size = 0;
    public void addCashMachine(CashMachine cashMachine) {
        this.size++;
        CashMachine[] newTab = new CashMachine[][this.size];
        System.arraycopy(cashMachines, srcPos:0, newTabewTab, destPos:0, cashMachines.length);
        newTab[this.size - 1] = cashMachine;
        this.cashMachines = newTab;
}