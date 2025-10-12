public class Main {
    public static void main(String[] args) {

        ATC atc = new ATC("СПб, ул. Связи, 1", 100, 300);

        System.out.println(atc);


        double total = atc.computeTotalMonthlyFee();
        System.out.println("Общая абонентская плата: " + total);


        atc.setSubscribersCount(10);
        atc.setMonthlyFee(13);
        atc.setAddress("СПб, ул. Связи, 1");

        System.out.println(atc);
        System.out.println("Общая абонентская плата после ошибок: " + atc.computeTotalMonthlyFee() + "руб");
    }
}
