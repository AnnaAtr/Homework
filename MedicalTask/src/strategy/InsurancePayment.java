package strategy;

public class InsurancePayment implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Оплата " + amount + " руб. по страховке");
    }
}