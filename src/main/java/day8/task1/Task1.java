package day8.task1;

public class Task1 {
    public static void main(String[] args) {

        String numbers = "";
        long before = System.currentTimeMillis();
        for (int i = 0; i <= 2000; i++) {
            System.out.println();
            numbers += i + " ";
        }
        long after = System.currentTimeMillis();
        System.out.println("Millis " + (after - before));
        System.out.println(numbers);

        StringBuilder stringBuilder = new StringBuilder("");
        long before2 = System.currentTimeMillis();

        for (int i = 0; i <= 2000; i++)
            stringBuilder.append(i).append(" ");
        long afrer2 = System.currentTimeMillis();

        System.out.println("Millis " + (afrer2 - before2));
        System.out.println(stringBuilder);

    }
}
