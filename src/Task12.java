import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task12 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите количество учеников: ");
        final int kids_count = Integer.parseInt(br.readLine());
        System.out.println("Введите желаемый процент: ");
        final int percent = Integer.parseInt(br.readLine());
        final int milk_size_package = 900;
        final int milk_portion = 200;
        double count_less_30kg = (double)kids_count * (double)percent % 100 != 0 ? ((double)kids_count * ((double)percent / 100)) + 1 : (double)kids_count * ((double)percent / 100);
        int cakes_need = kids_count + (int)count_less_30kg;
        double milk_need = ((count_less_30kg * milk_portion) % milk_size_package) != 0 ? ((count_less_30kg * milk_portion) / milk_size_package) + 1: ((count_less_30kg * milk_portion) / milk_size_package);
        System.out.println("Нужно пирожков: " + cakes_need + " шт." +"\n" + "Нужно молока: " + (int)milk_need + " уп.");
    }
}