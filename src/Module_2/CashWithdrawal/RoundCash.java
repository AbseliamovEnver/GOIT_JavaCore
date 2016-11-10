package Module_2.CashWithdrawal;

public class RoundCash {
    public static int roundCeshDown(double d) {

        int i;
        i = (int) d;
        if (i % 5 != 0) {
            i = (i / 5) * 5;
        }
        int output = i;
        return output;
    }
}