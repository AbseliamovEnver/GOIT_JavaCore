package Module_4;

public class USBank extends Bank {
    public USBank(long id, String bankCountry, Currency currency, int numberOfEmployees,
                  double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    @Override
    int getLimitOfWithdrawal() {
        int limitOfWithdrawal = 0;
        if (getCurrency() == Currency.USD) {
            limitOfWithdrawal = 1000;
        } else if (getCurrency() == Currency.EUR) {
            limitOfWithdrawal = 1200;
        }
        return limitOfWithdrawal;
    }

    @Override
    int getLimitOfFunding() {
        int limitOfFunding = 0;
        if (getCurrency() == Currency.EUR) {
            limitOfFunding = 10000;
        } else if (getCurrency() == Currency.USD) {
            limitOfFunding = Integer.MAX_VALUE;
        }
        return limitOfFunding;
    }

    @Override
    int getMonthlyRate() {
        int monthlyRate = 0;
        if (getCurrency() == Currency.USD) {
            monthlyRate = 1;
        } else if (getCurrency() == Currency.EUR) {
            monthlyRate = 2;
        }
        return monthlyRate;
    }

    @Override
    int getCommission(int summ) {
        int commission = 0;
        if (getCurrency() == Currency.USD) {
            if (summ <= 1000) {
                commission = (int) (summ * 0.05);
            } else {
                commission = (int) (summ * 0.07);
            }
        } else if (getCurrency() == Currency.EUR) {
            if (summ <= 1000) {
                commission = (int) (summ * 0.06);
            } else {
                commission = (int) (summ * 0.08);
            }
        }
        return commission;
    }

}