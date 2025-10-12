public class ATC {

    private String address;
    private int subscribersCount;
    private int monthlyFee;

    public ATC(String address, int subscribersCount, int monthlyFee) {
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

        if (s.length() < 3 || s.length() > 120) {
            System.out.println("Ошибка: длина адреса от 3 до 120 символов.");
            return;
        }

        if (!s.matches("[\\p{L}\\p{N}\\s.,\\-/#№()]+")) {
            System.out.println("Ошибка: адрес содержит недопустимые символы.");
            return;
        }

        if (!s.chars().anyMatch(Character::isLetter)) {
            System.out.println("Ошибка: адрес должен содержать буквы.");
            return;
        }

        this.address = s;
    }


    public void setSubscribersCount(int subscribersCount) {
        if (subscribersCount < 0) {
            System.out.println("Введено отрицательное значение кол-ва подписчиков");
            this.subscribersCount = 0;
        } else {
            this.subscribersCount = subscribersCount;
        }
    }

    public void setSubscribersCount(String input) {
        if (input == null) {
            System.out.println("Введено некорректное значение кол-ва подписчиков");
            return;
        }
        String s = input.trim();
        if (!s.matches("\\d+")) {
            System.out.println("Введено некорректное значение кол-ва подписчиков");
            return;
        }
        try {
            setSubscribersCount(Integer.parseInt(s));
        } catch (NumberFormatException e) {
            System.out.println("Введено некорректное значение кол-ва подписчиков");
        }
    }


    public void setMonthlyFee(int monthlyFee) {
        if (monthlyFee < 0) {
            System.out.println("Введено отрицательное значение месячной подписки");
            this.monthlyFee = 0;
            return;
        }

        this.monthlyFee = monthlyFee;

    }

    public void setMonthlyFee(String input) {
        if (input == null) {
            System.out.println("Введено некорректное значение месячной подписки");
            return;
        }
        String s = input.trim();
        if (!s.matches("\\d+")) {
            System.out.println("Введено некорректное значение месячной подписки");
            return;
        }
        try {
            setMonthlyFee(Integer.parseInt(s));
        } catch (NumberFormatException e) {
            System.out.println("Введено некорректное значение месячной подписки");
        }
    }


    public int computeTotalMonthlyFee() {
        return monthlyFee * subscribersCount;
    }

    public String getAddress() {
        return address;
    }

    public int getMonthlyFee() { return monthlyFee; }

    @Override
    public String toString() {
        return "ATC: по адресу:" + address + ", абонентская плата = " + monthlyFee + "руб";
    }


}
