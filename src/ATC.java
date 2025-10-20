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
        this.address = address.trim();
    }

    public void setSubscribersCount(int subscribersCount) {
        this.subscribersCount = subscribersCount;
    }

    public void setMonthlyFee(int monthlyFee) {
        this.monthlyFee = monthlyFee;
    }

    public long computeTotalMonthlyFee() {
        return (long) monthlyFee * (long) subscribersCount;
    }

    public String getAddress() {
        return address;
    }

    public void print() {
        System.out.println("Адрес АТС: " + address);
        System.out.println("Общая абонентская плата: " + computeTotalMonthlyFee() + " руб.");
    }
}