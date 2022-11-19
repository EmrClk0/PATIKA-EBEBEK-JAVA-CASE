import java.util.Locale;
import java.util.Scanner;

public class MobilePhone extends ProductGroup{
    protected int storageSpace;
    protected double screenSize;
    protected int batteryPower;
    protected int memory;
    protected String color;

    public MobilePhone(long id, double unitPrice, double discountRate, long amountOfStock, String productName, Brand productBrand,
                       int storageSpace, double screenSize, int batteryPower, int memory, String color) {
        this.id = id;
        this.unitPrice = unitPrice;
        this.discountRate = discountRate;
        this.amountOfStock = amountOfStock;
        this.productName = productName;
        this.productBrand = productBrand;
        this.storageSpace = storageSpace;
        this.screenSize = screenSize;
        this.batteryPower = batteryPower;
        this.memory = memory;
        this.color = color;
    }

    public MobilePhone(){

    }


    @Override
    public void printData(){
        int space = 200/11;
        String formatspace = "%"+ Integer.toString(space)+"s";
        System.out.format(formatspace+"|",this.id);
        System.out.format(formatspace+"|",this.unitPrice);
        System.out.format(formatspace+"|",this.discountRate);
        System.out.format(formatspace+"|",this.amountOfStock);
        System.out.format(formatspace+"|",this.productName);
        System.out.format(formatspace+"|",this.productBrand.name);
        System.out.format(formatspace+"|",this.storageSpace);
        System.out.format(formatspace+"|",this.screenSize);
        System.out.format(formatspace+"|",this.batteryPower);
        System.out.format(formatspace+"|",this.memory);
        System.out.format(formatspace+"|",this.color);
    }

    public  String[] getVariableNames(){
        return new String[]{"id", "unitPrice",  "discountRate",  "amountOfStock",  "productName",  "productBrand",
         "storageSpace",  "screenSize",  "batteryPower",  "memory",  "color"};
    }

    @Override
    public MobilePhone returnNewProduct() {
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
        System.out.print("productBrand ıd GİR: ");
        int productBrandİndex = scanner.nextInt();
        System.out.print("storageSpace GİR: ");
        int storageSpace= scanner.nextInt();
        System.out.print("screenSize GİR: ");
        double screenSize= scanner.nextDouble();
        System.out.print("batteryPower GİR: ");
        int batteryPower=scanner.nextInt();
        System.out.print("memory GİR: ");
        int memory= scanner.nextInt();
        System.out.print("color GİR: ");
        String color = scanner.next();
        return  new MobilePhone(id,unitPrice,discountRate,amountOfStock,productName,Brand.brands.get(productBrandİndex-1),storageSpace,screenSize,batteryPower,memory,color);

    }
}
