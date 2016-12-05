package main.java.module4;

public class ChinaBank extends Bank {
    public ChinaBank(long id, String bankCountry, Currency currency, int numberOfEmployees,
                     double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    @Override
    public int getLimitOfWithdrawal() {
        int limitOfWithdrawal = 0;
        if (getCurrency() == Currency.USD) {
            limitOfWithdrawal = 100;
        } else if (getCurrency() == Currency.EUR) {
            limitOfWithdrawal = 150;
        }
        return limitOfWithdrawal;
    }

    @Override
    public int getLimitOfFunding() {
        int limitOfFunding = 0;
        if (getCurrency() == Currency.EUR) {
            limitOfFunding = 5000;
        } else if (getCurrency() == Currency.USD) {
            limitOfFunding = 10000;
        }
        return limitOfFunding;
    }

    @Override
    public int getMonthlyRate() {
        int monthlyRate = 0;
        if (getCurrency() == Currency.USD) {
            monthlyRate = 1;
        } else if (getCurrency() == Currency.EUR) {
            monthlyRate = 0;
        }
        return monthlyRate;
    }

    @Override
    public int getCommission(int summ) {
        int commission = 0;
        if (getCurrency() == Currency.USD) {
            if (summ <= 1000) {
                commission = (int) (summ * 0.03);
            } else {
                commission = (int) (summ * 0.05);
            }
        } else if (getCurrency() == Currency.EUR) {
            if (summ <= 1000) {
                commission = (int) (summ * 0.1);
            } else {
                commission = (int) (summ * 0.11);
            }
        }
        return commission;
    }
}