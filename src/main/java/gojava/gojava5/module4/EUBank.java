package gojava.gojava5.module4;

public class EUBank extends Bank {
    public EUBank(long id, String bankCountry, Currency currency, int numberOfEmployees,
                  double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    @Override
    int getLimitOfWithdrawal() {
        int limitOfWithdrawal = 0;
        if (getCurrency() == Currency.USD) {
            limitOfWithdrawal = 2000;
        } else if (getCurrency() == Currency.EUR) {
            limitOfWithdrawal = 2200;
        }
        return limitOfWithdrawal;
    }

    @Override
    int getLimitOfFunding() {
        int limitOfFunding = 0;
        if (getCurrency() == Currency.EUR) {
            limitOfFunding = 20000;
        } else if (getCurrency() == Currency.USD) {
            limitOfFunding = 10000;
        }
        return limitOfFunding;
    }

    @Override
    int getMonthlyRate() {
        int monthlyRate = 0;
        if (getCurrency() == Currency.USD) {
            monthlyRate = 0;
        } else if (getCurrency() == Currency.EUR) {
            monthlyRate = 1;
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
                commission = (int) (summ * 0.02);
            } else {
                commission = (int) (summ * 0.04);
            }
        }
        return commission;
    }
}