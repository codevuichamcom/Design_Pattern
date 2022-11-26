public class ComplexBusiness {
    PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void payment(double amount) {
        paymentStrategy.pay(amount);
    }

}
