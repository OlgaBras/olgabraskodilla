package com.kodilla.homework;



public class cashMachineTestSuite {



    @Test
    public void shouldAddTransactions() {
        //Given
        CashMachine cashMachine = new CashMachine();
        cashMachine.addTransactions(100);
        cashMachine.addTransactions(-150);
        cashMachine.addTransactions(200);

        //When
        int count = cashMachine.numberOfTransactions();

        //Then
        assertEquals(expected 3,count);

    }
}

