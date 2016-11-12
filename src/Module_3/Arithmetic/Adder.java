package Module_3.Arithmetic;

public class Adder extends Arithmetic {

    public boolean chek(int a, int b) {
        boolean compare;

        if (a >= b) {
            compare = true;
            System.out.println("a >= b - " + compare);
        } else {
            compare = false;
            System.out.println("a >= b - " + compare);
        }
        return compare;
    }
}
