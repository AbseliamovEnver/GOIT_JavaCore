package Module_3.Bird;

public class Bird {
    public static void main(String[] args) {
        sing();
    }

    public static void sing() {
        String[] action = {"walking", "flying", "singing", "Bird"};
        for (int i = 0; i < action.length; i++) {
            System.out.println("I am " + action[i]);
        }
    }
}
