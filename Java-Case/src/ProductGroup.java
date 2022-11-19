public abstract class ProductGroup {
    protected long id;
    protected double unitPrice;
    protected double discountRate;
    protected long amountOfStock;
    protected String productName;
    protected Brand productBrand;


    protected  abstract void printData();
    public  abstract String[] getVariableNames();
    public abstract ProductGroup returnNewProduct();
}
