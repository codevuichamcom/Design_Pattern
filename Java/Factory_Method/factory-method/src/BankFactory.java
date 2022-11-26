public class BankFactory {
    public static final IBank getBank(BankType type) {
        switch (type) {
            case TPBank:
                return new TPBank();
            case VietComBank:
                return new TPBank();
            default:
                throw new IllegalArgumentException("This bank type is unsupported");
        }
    }
}
