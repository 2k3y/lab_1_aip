public class ATC {

    private String address;
    private int subscribersCount;
    private double monthlyFee; // будет свойство *только для записи*

    public ATC(String address, int subscribersCount, double monthlyFee) {
        setAddress(address);
        setSubscribersCount(subscribersCount);
        setMonthlyFee(monthlyFee);
    }

    public void setAddress(String address) {
        if (address == null || address.isBlank()) {
            System.out.println("Ошибка: адрес пустой!");
        } else {
            this.address = address;
        }
    }


    public void setSubscribersCount(int subscribersCount) {
        if (subscribersCount < 0) {
            System.out.println("Введено отрицательное число абонентов, установлено значение 0");
            this.subscribersCount = 0;
        } else {
            this.subscribersCount = subscribersCount;
        }
    }


    public void setMonthlyFee(double monthlyFee) {
        if (monthlyFee < 0) {
            System.out.println("Ошибка: абонентская плата не может быть отрицательной!");
        } else {
            this.monthlyFee = monthlyFee;
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
