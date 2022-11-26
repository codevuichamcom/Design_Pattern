public class VietComBank implements IBank {

    @Override
    public String getName() {
        return "VietComBank";
    }

    public void superSale() {
        System.out.println("Super sale");
    }
}
