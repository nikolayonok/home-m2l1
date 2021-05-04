public class Task11 {
    public static void main(String[] args) {
        final int time = 250000000;
        int days = time / 86400;
        int hours = (time - (days * 86400)) / 3600;
        int minutes = (time - ((days * 86400) + (hours * 3600))) / 60;
        int seconds = (time - ((days * 86400) + (hours * 3600) + (minutes * 60)));
        System.out.println(days + " дней, " + hours + " часов, " + minutes + " минут, " + seconds + " cекунд");
    }
}
