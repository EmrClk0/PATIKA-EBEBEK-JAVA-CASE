import java.util.Locale;
import java.util.Scanner;

public class Notebook extends ProductGroup{
    protected int storageSpace;
    protected double screenSize;
    protected int memory;

    public Notebook(long id, double unitPrice, double discountRate, long amountOfStock, String productName, Brand productBrand,
                       int storageSpace, double screenSize, int memory) {
        this.id = id;
        this.unitPrice = unitPrice;
        this.discountRate = discountRate;
        this.amountOfStock = amountOfStock;
        this.productName = productName;
        this.productBrand = productBrand;
        this.storageSpace = storageSpace;
        this.screenSize = screenSize;
        this.memory = memory;

    }

    public Notebook(){

    }

    @Override
    public void printData(){
        int space = 200/9;
        String formatspace = "%"+ Integer.toString(space)+"s";
        System.out.format(formatspace+"|",this.id);
        System.out.format(formatspace+"|",this.unitPrice);
        System.out.format(formatspace+"|",this.discountRate);
        System.out.format(formatspace+"|",this.amountOfStock);
        System.out.format(formatspace+"|",this.productName);
        System.out.format(formatspace+"|",this.productBrand.name);
        System.out.format(formatspace+"|",this.storageSpace);
        System.out.format(formatspace+"|",this.screenSize);
        System.out.format(formatspace+"|",this.memory);

    }

    public  String[] getVariableNames(){
        return new String[]{"id",  "unitPrice",  "discountRate",  "amountOfStock",  "productName",  "productBrand",
         "storageSpace",  "screenSize",  "memory"};
    }

    @Override
    public Notebook returnNewProduct() {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.print("İD GİR: ");
        long id =  scanner.nextLong();
        System.out.print("unitPrice GİR: ");
        double unitPrice=scanner.nextDouble();
        System.out.print("discountRate GİR: ");
        double discountRate= scanner.nextDouble();
        System.out.print("amountOfStock GİR: ");
        long amountOfStock= scanner.nextLong();
        System.out.print("productName GİR: ");
        String productName = scanner.next();
        BrandController.showAllBrandsWithIndex();
        System.out.print("productBrandİndex GİR: ");
        int productBrandİndex = scanner.nextInt();
        System.out.print("storageSpace GİR: ");
        int storageSpace= scanner.nextInt();
        System.out.print("screenSize GİR: ");
        double screenSize= scanner.nextDouble();
        System.out.print("memory GİR: ");
        int memory= scanner.nextInt();

        return  new Notebook(id,unitPrice,discountRate,amountOfStock,productName,Brand.brands.get(productBrandİndex-1),storageSpace,screenSize,memory);

    }
}
