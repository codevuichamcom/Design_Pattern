import java.io.BufferedReader;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) throws Exception {
        ComplexBusiness business = new ComplexBusiness();

        while (true) {
            System.out.println("Choose payment method: ");
            System.out.println("1. Payment by cash");
            System.out.println("2. Payment by banking");
            System.out.println("3. Payment by coin");

            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            int option = Integer.parseInt(in.readLine());

            switch (option) {
                case 2:
                    business.setPaymentStrategy(new PaymentByBanking());
                    break;
                case 3:
                    business.setPaymentStrategy(new PaymentByCoin());
                    break;
                default:
                    business.setPaymentStrategy(new PaymentByCash());
            }

            business.payment(1000);
        }

    }
}
