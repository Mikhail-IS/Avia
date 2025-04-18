public class Main {
    public static void main(String[] args) {
        int ticket = 15000;
        int rubles = 20;

        if (ticket >= rubles) {
            int miles = ticket / rubles;
            System.out.println("Начислено миль: " + miles);
        } else {
            System.out.println("Начислено миль: 0");
        }
    }
}