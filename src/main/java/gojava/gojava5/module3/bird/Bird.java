package gojava.gojava5.module3.bird;

public class Bird {
    public static void main(String[] args) {
        sing();
    }

    public static void sing() {
        String[] action = {"walking", "flying", "singing", "bird"};
        for (int i = 0; i < action.length; i++) {
            System.out.println("I am " + action[i]);
        }
    }
}
