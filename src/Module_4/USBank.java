package Module_4;

public class USBank extends Bank {

    private int limitOfWithdrawal;
    private int limitOfFunding;
    private int monthlyRate;
    private int commission;

    public USBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    @Override
    int getLimitOfWithdrawal() {
        if (currency == Currency.USD) {
            limitOfWithdrawal = 1000;
        } else if (currency == Currency.EUR) {
            limitOfWithdrawal = 1200;
        }
        return limitOfWithdrawal;
    }

    @Override
    int getLimitOfFunding() {
        if (currency == Currency.EUR) {
            limitOfFunding = 10000;
        } else if (currency == Currency.USD) {
            limitOfFunding = Integer.MAX_VALUE;
        }
        return limitOfFunding;
    }

    @Override
    int getMonthlyRate() {
        if (currency == Currency.USD) {
            monthlyRate = 1;
        } else if (currency == Currency.EUR) {
            monthlyRate = 2;
        }
        return monthlyRate;
    }

    @Override
    int getCommission(int summ) {
        if (currency == Currency.USD) {
            if (summ <= 1000) {
                commission = (int) (summ * 0.05);
            } else {
                commission = (int) (summ * 0.07);
            }
        } else if (currency == Currency.EUR) {
            if (summ <= 1000) {
                commission = (int) (summ * 0.06);
            } else {
                commission = (int) (summ * 0.08);
            }
        }
        return commission;
    }

}
//        USBank: лимит снятия = 1000, если валюта - USD и 1200, если валюта - EUR
//        лимит пополнения - 10000, если EUR, и нет лимита, если USD
//        месячная ставка - 1% на USD и 2% на EUR
//        комиссия 5%, если USD и до 1000, 7%, если USD и больше 1000
//        6%, если EUR и до 1000 и 8%, если EUR и больше 1000