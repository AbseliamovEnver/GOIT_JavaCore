package gojava.gojava5.module3.user;

public class Main {
    public static void main(String[] args) {
        User user = new User("Ivanov", 1000, 12, "Go IT", 1000, "$");

        user.paySalary();
        user.withdraw(1000);
        user.companyNameLenght();
        user.monthIncreaser(10);
    }
}
