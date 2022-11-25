public class PaymentByBanking implements PaymentStrategy {

    @Override
    public void pay(double amount) {
        System.out.println("Payment " + amount + " by Banking");

    }

}
