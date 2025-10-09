public class Main {
    public static void main(String[] args) {
        // Создание объекта с нормальными данными
        ATC atc = new ATC("СПб, ул. Связи, 1", 1200, 300.0);

        // 1. Вывод объекта (через toString)
        System.out.println(atc);

        // 2. Подсчёт общей абонентской платы
        double total = atc.computeTotalMonthlyFee();
        System.out.println("Общая абонентская плата: " + total);

        // 3. Проверка ошибок
        atc.setSubscribersCount("цуйц");  // должно вывести предупреждение
        atc.setMonthlyFee("йу");         // должно вывести предупреждение
        atc.setAddress("Какой-то адрес"); // false + сообщение

        // 4. Ещё раз выводим объект и итог
        System.out.println(atc);
        System.out.println("Общая абонентская плата после ошибок: " + total);
    }
}
