public class App {
    public static void main(String[] args) throws Exception {
        IBank bank = BankFactory.getBank(BankType.VietComBank);
        System.out.println(bank.getName());

    }
}
