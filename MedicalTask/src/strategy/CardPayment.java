package strategy;

public class CardPayment implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Оплата " + amount + " руб. картой пациента");
    }
}
