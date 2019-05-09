package command;

/**
 * This class is a command: it implements the Order interface.
 */
public class BuyStock implements Order {

    private Stock abcStock;
    private Stock lastStock;

    public BuyStock(Stock newStock) {
        lastStock = abcStock;
        this.abcStock = newStock;
    }
    
    @Override
    public void UndoStock() {
        abcStock = lastStock;
        System.out.println("Order cancelled");
    }

    @Override
    public void execute() {
        abcStock.buy();
    }
}
