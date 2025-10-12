import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        ATC atc = new ATC();
        atc.setAddress("Ул. Ленина");
        atc.setMonthlyFee(5);

        int number;
        while (true) {
            System.out.print("Введите количество пользователей: ");
            System.out.flush();
            String line = in.nextLine().trim();

            if (line.isEmpty()) {
                System.out.println("Пусто. Введите целое число ≥ 0.");
                continue;
            }
            if (!line.matches("\\d+")) {
                System.out.println("Ошибка: нужно целое число без знаков.");
                continue;
            }
            try {
                number = Integer.parseInt(line);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Слишком большое число (макс 2147483647).");
            }
        }

        System.out.println("Вы ввели число: " + number);
        atc.setSubscribersCount(number);
        atc.print();
    }
}
