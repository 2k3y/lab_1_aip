import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        ATC atc = new ATC();
        atc.setAddress("Ул. Ленина");
        atc.setMonthlyFee(5);
        atc.setSubscribersCount(10);
        int number;
        while (true) {
            System.out.print("Введите количество пользователей: "); // та же строка
            System.out.flush();                                      // на всякий случай, чтобы подсказка сразу вывелась
            String line = in.nextLine().trim();                      // читаем ВСЮ строку

            if (line.isEmpty()) {
                System.out.println("Пусто. Введите целое число ≥ 0.");
                continue;
            }
            if (!line.matches("\\d+")) {                             // только цифры, без знаков
                System.out.println("Ошибка: нужно целое число без знаков.");
                continue;
            }
            try {
                number = Integer.parseInt(line);                     // ловим переполнение int
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
