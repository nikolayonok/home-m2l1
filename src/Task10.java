public class Task10 {
    public static void main(String[] args) {
        final int height = 190;
        final int weight = 120;
        if(weight + 110 > height) {
            System.out.println("Вам необходимо сбросить " + ((weight + 110) - height) + "кг");
        }
        else if(weight + 110 < height) {
            System.out.println("Вам необходимо набрать " + (height - (weight + 110)) + "кг");
        }
        else {
            System.out.println("Ваш вес идеален");
        }
    }
}
