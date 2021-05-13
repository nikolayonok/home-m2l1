public class Task7 {
    public static void main(String[] args) {
        final double percent = 10;
        final int deposit = 8766;
        System.out.println("Сумма вклада спустя 2 года: " + (int)(2 * ((percent / 100)
                * deposit) + deposit));
    }
}
