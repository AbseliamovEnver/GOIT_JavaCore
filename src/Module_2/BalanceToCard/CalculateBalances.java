package Module_2.BalanceToCard;

import java.util.Scanner;

public class CalculateBalances {
    static int withdrawal = 0;

    public static void Calculate() {
        int[] balances = {2548, 6859, 9637, 100, 26};
        String[] ownerNames = {"Jane", "Ann", "Jack", "Bill", "Lane"};

        int indexName = (int) (Math.random() * 4);
        int indexBalance = indexName;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сумму, которую требуется снять со счёта: " + ownerNames[indexName]);
        withdrawal = scanner.nextInt();

        int balanceUser = balances[indexBalance];
        if (balanceUser > (double) withdrawal * 1.05) {
            double comission = (withdrawal * 5.0 / 100);
            double accountBalance = (balances[indexBalance] - withdrawal * 1.05);
            System.out.println(ownerNames[indexName] + " получите Ваши деньги");
            System.out.printf("Коммисия за снятие 5 процент: " + "%6.2f", comission);
            System.out.println();
            System.out.printf("Остаток на счету: " + "%6.2f", accountBalance);
        } else {
            double moneyAvailable = (balances[indexBalance] - (balances[indexBalance] * 5 / 100));
            System.out.println(ownerNames[indexName] + " недостаточно средств на счету");
            System.out.printf("Остаток на счету: " + "%6.2f", (double) balances[indexBalance]);
            System.out.println();
            System.out.println("Максимальная сумма доступная к снятию без учета коммисии: " + moneyAvailable);
        }
    }
}