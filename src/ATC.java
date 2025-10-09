public class ATC {

    private String address;
    private int subscribersCount;
    private double monthlyFee;

    public ATC(String address, int subscribersCount, double monthlyFee) {
        setAddress(address);
        setSubscribersCount(subscribersCount);
        setMonthlyFee(monthlyFee);
    }

    public void setAddress(String address) {
        if (address == null || address.isBlank()) {
            System.out.println("Ошибка: адрес пустой!");
            return;
        }

        String s = address.trim();

        while (s.contains("  ")) {
            s = s.replace("  ", " ");
        }

        if (s.length() < 3 || s.length() > 120) {             // 3) разумная длина
            System.out.println("Ошибка: длина адреса от 3 до 120 символов.");
            return;
        }

        if (!s.matches("[\\p{L}\\p{N}\\s.,\\-/#№()]+")) {
            System.out.println("Ошибка: адрес содержит недопустимые символы.");
            return;
        }

        this.address = s;
    }


    public void setSubscribersCount(int subscribersCount) {
        if (subscribersCount < 0) {
            System.out.println("Введено некорректное число абонентов, установлено значение 0");
            this.subscribersCount = 0;
        } else {
            this.subscribersCount = subscribersCount;
        }
    }

    public void setSubscribersCount(String input) {
        if (input == null) {
            System.out.println("Введено некорректное значение");
            return;
        }
        String s = input.trim();
        if (!s.matches("\\d+")) {                 // только цифры 0–9
            System.out.println("Введено некорректное значение");
            return;
        }
        try {
            setSubscribersCount(Integer.parseInt(s)); // делегируем в int-сеттер
        } catch (NumberFormatException e) {          // на случай переполнения int
            System.out.println("Введено некорректное значение");
        }
    }


    public void setMonthlyFee(double monthlyFee) {
        if (monthlyFee < 0) {
            System.out.println("Ошибка: абонентская плата не может быть отрицательной!");
        } else {
            this.monthlyFee = monthlyFee;
        }
    }

    public void setMonthlyFee(String input) {
        if (input == null) {
            System.out.println("Введено некорректное значение");
            return;
        }
        String s = input.trim();
        if (!s.matches("\\d+")) { // только цифры 0–9, хотя бы одна
            System.out.println("Введено некорректное значение");
            return;
        }
        try {
            setMonthlyFee(Integer.parseInt(s)); // делегируем проверку на <0
        } catch (NumberFormatException e) {
            System.out.println("Введено некорректное значение");
        }
    }


    public double computeTotalMonthlyFee() {
        return monthlyFee * subscribersCount;
    }

    public String getAddress() {
        return address;
    }

    public int getSubscribersCount() {
        return subscribersCount;
    }

    @Override
    public String toString() {
        return "ATC по адресу: " + address + ", кол-во абонентов: " + subscribersCount;
    }


}
