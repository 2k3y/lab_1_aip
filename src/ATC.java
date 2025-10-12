public class ATC {
    private String address;
    private int subscribersCount;
    private int monthlyFee;

    public ATC() { }

    public ATC(String address, int subscribersCount, int monthlyFee) {
        setAddress(address);
        setSubscribersCount(subscribersCount);
        setMonthlyFee(monthlyFee);
    }

    public void setAddress(String address) {
        if (address == null || address.trim().isEmpty()) {
            System.out.println("Ошибка: адрес пустой!");
            return;
        }
        this.address = address.trim();
    }

    public void setSubscribersCount(int subscribersCount) {
        if (subscribersCount < 0) {
            System.out.println("Ошибка: число абонентов не может быть отрицательным");
            this.subscribersCount = 0;
            return;
        }
        this.subscribersCount = subscribersCount;
    }

    public void setMonthlyFee(int monthlyFee) {
        if (monthlyFee < 0) {
            System.out.println("Ошибка: абонентская плата не может быть отрицательной");
            this.monthlyFee = 0;
            return;
        }
        this.monthlyFee = monthlyFee;
    }

    public long computeTotalMonthlyFee() {
        return (long) monthlyFee * (long) subscribersCount;
    }

    public int getMonthlyFee() { return monthlyFee; }

    public String getAddress() { return address; }

    public void print() {
        System.out.println("Адрес АТС: " + address);
        System.out.println("Абонентская плата: " + computeTotalMonthlyFee());
    }
}