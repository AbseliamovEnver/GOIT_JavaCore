package Module_2.CashWithdrawal;

public class MainCash {

    public static void main(String[] args) {

        System.out.printf("Доступно средств на счету: " + "%8.2f", Calculate.balance);
        System.out.println();
        Calculate.scanHowMatchCashToRemove();
        Calculate.howMatchCashHave();
    }
}