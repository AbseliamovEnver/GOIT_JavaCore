package gojava.gojava5.module1;

public class Main {
    public static void main(String[] args) {
        System.out.println("Модуль первый - вывод текста:");

        FirstClass firstClass = new FirstClass();
        SecondClass secondClass = new SecondClass();
        ThirdClass thirdClass = new ThirdClass();
        FourthClass fourthClass = new FourthClass();
        FifthClass fifthClass = new FifthClass();

        firstClass.printFirstClass();
        secondClass.printSecondClass();
        thirdClass.printThirdClass();
        fourthClass.printFourthClass();
        fifthClass.printFifthClass();
    }
}
