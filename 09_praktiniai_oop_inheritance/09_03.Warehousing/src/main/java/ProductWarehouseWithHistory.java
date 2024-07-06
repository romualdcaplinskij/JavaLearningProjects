public class ProductWarehouseWithHistory extends ProductWarehouse {

    private double initialBalance;
    private ChangeHistory history;


    public ProductWarehouseWithHistory(String name, double capacity, double initialBalance) {
        super(name, capacity);
        history = new ChangeHistory();
        history.add(initialBalance);
        this.initialBalance = initialBalance;
    }

    public String history(){
        return null;
    }

}
