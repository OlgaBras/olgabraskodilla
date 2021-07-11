package com.kodilla.basic_assertion;

 class Application {
     public static void main(String[] args) {
         Calculator calculator = new Calculator();
         int a = 5;
         int b = 8;
         int sumResults = calculator.sum(a, b);
         int subResults = calculator.sub(a, b);
         int powResults = calculator.pow(a);
         boolean correct = ResultChecker.assertEqulas(expected:13, sumResult);
         if (correct) {
             System.out.println("Metoda sum działa poprawnie dla liczb " + a + " i " + b);
         } else {
             System.out.println("Metoda sum działa poprawnie dla liczb " + a + " i " + b);
         }
         correct = ResultChecker.assertEqulas(expected:-3, sumResult);
         if (correct) {
             System.out.println("Metoda sub działa poprawnie dla liczb " + a + " i " + b);
         } else {
             System.out.println("Metoda sub działa poprawnie dla liczb " + a + " i " + b);
         }
         correct = ResultChecker.assertEqulas(expected:25, sumResult);
         if (correct) {
             System.out.println("Metoda pow działa poprawnie dla liczb " + a + " i " + b);
         } else {
             System.out.println("Metoda pow działa poprawnie dla liczb " + a + " i " + b);
         }
     }
 }
