package Module_3.User;

public class User {
    private String name;
    private int balance;
    private int monthsOfEmployment;
    private String companyName;
    private int salary;
    private String currency;

    public User(String name, int balance, int monthsOfEmployment, String companyName, int salary, String currency) {

        this.name = name;
        this.balance = balance;
        this.monthsOfEmployment = monthsOfEmployment;
        this.companyName = companyName;
        this.salary = salary;
        this.currency = currency;
    }

    public void paySalary() {
        setBalance(getBalance() + getSalary());
        System.out.println("Account balance: " + getBalance() + getCurrency());
    }

    public void withdraw(int sum) {
        if (sum < 1000 && (sum * 1.05) < getBalance()) {
            setBalance(getBalance() - (sum + (sum * 5) / 100));
            System.out.println("The balance of the account after withdrawal: " + getBalance() + getCurrency());
        } else if (sum >= 1000 && (sum * 1.1) < getBalance()) {
            setBalance(getBalance() - (sum + (sum * 10) / 100));
            System.out.println("The balance of the account after withdrawal: " + getBalance() + getCurrency());
        } else {
            System.out.println("Insufficient funds in the account");
        }
    }

    public void companyNameLenght() {
        int companyNameLenght = getCompanyName().length();
        System.out.println("Name of the company is made up of " + companyNameLenght + " characters");
    }

    public void monthIncreaser(int addMonth) {
        setMonthsOfEmployment(getMonthsOfEmployment() + addMonth);
        System.out.println("Months of increase of " + addMonth);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getMonthsOfEmployment() {
        return monthsOfEmployment;
    }

    public void setMonthsOfEmployment(int monthsOfEmployment) {
        this.monthsOfEmployment = monthsOfEmployment;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
}
