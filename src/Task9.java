public class Task9 {
    public static void main(String[] args) {
        double value = 3.39;
        int a = (int)value;
        if(value > a) {
            System.out.println("Число " + value + " имеет вещественную часть");
        } else {
            System.out.println("Число " + value + " не имеет вещественную часть");
        }
    }
}
