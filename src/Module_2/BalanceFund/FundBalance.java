package Module_2.BalanceFund;

import java.util.Scanner;

public class FundBalance {
    static int withdrawal = 0;

    public static void Fund() {
        int[] balances = {1200, 250, 2000, 500, 3200};
        String[] ownerNames = {"Jane", "Ann", "Jack", "Bill", "Lane"};

        int indexName = (int) (Math.random() * 4);
        int indexBalance = indexName;

        Scanner scanner = new Scanner(System.in);
        System.out.println(ownerNames[indexName] + " введите сумму, на которую хотите пополнить счёт");
        withdrawal = scanner.nextInt();

        balances[indexBalance] += withdrawal;

        System.out.println(ownerNames[indexName] + " Ваш счёт пополнен на " + withdrawal);
        System.out.printf("Остаток на счету: " + "%6.2f", (double)balances[indexBalance]);
    }
}
