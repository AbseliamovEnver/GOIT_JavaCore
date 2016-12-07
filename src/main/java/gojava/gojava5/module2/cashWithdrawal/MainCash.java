package gojava.gojava5.module2.cashWithdrawal;

public class MainCash {

    public static void main(String[] args) {
        double balance = Math.random() * 1000.0;
        System.out.printf("Баланс на счету: " + "%2.2f", balance);
        System.out.println();
        Calculate.howMatchCashHave(balance);
    }
}