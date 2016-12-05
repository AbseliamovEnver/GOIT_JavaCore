package main.java.module2.cashWithdrawal;

import java.util.Scanner;

public class Calculate {
    public static int howMatchCashHave(double balance) {
        int withdrawal = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сумму для снятия: ");
        withdrawal = scanner.nextInt();

        double moneyAvailable = (balance - (balance * 5 / 100));
        int moneyToRemove = (int) Math.round(moneyAvailable);

        if (withdrawal > 0 && withdrawal < Math.round(moneyAvailable)) {
            double comission = (withdrawal * 5.0 / 100);
            double accountBalance = (balance - withdrawal * 1.05);
            System.out.println("Получите Ваши деньги");
            System.out.printf("Коммисия за снятие 5 процент: " + "%6.2f", comission);
            System.out.println();
            System.out.printf("Остаток на счету: " + "%6.2f", accountBalance);
        } else if (withdrawal >= balance || (withdrawal * 1.05) > balance) {
            System.out.printf("Недостаточно средств на счету: " + "%6.2f", balance);
            System.out.println();
            System.out.println("Максимальная сумма доступная для снятия с учётом комиссии: " + moneyToRemove);
        }
        return withdrawal;
    }
}