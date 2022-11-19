import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ProductManager {
    private LinkedList<ProductGroup> products;
    private String variableNames[];
    private  ProductGroup productGroup;

    public ProductManager(ProductGroup productGroup){

        this.productGroup = productGroup;
        this.products = new LinkedList<>();
    }

    public void addProduct(ProductGroup productGroup){
        products.add(productGroup);
    } //main.java da elle değer atamak için olusturmus oldugum fonksiyon

    public void addProduct(){
        products.add(productGroup.returnNewProduct());
    }

    public  void  showProductsTable(){
        int space = 200/ this.productGroup.getVariableNames().length;
        String formatspace = "%"+ Integer.toString(space)+"s";
        System.out.println("-".repeat(space*this.productGroup.getVariableNames().length)); //---------------------

        for (String str: this.productGroup.getVariableNames())
            System.out.format(formatspace+"|",str);
        System.out.println();

        System.out.println("-".repeat(space*this.productGroup.getVariableNames().length));


        for (ProductGroup product: this.products){

            product.printData();
            System.out.println();
        }

        System.out.println("-".repeat(space*this.productGroup.getVariableNames().length));


    }

    public void showProductsTable(int brandID){
        int space = 200/ this.productGroup.getVariableNames().length;
        String formatspace = "%"+ Integer.toString(space)+"s";
        System.out.println("-".repeat(space*this.productGroup.getVariableNames().length));

        for (String str: this.productGroup.getVariableNames())
            System.out.format(formatspace+"|",str);
        System.out.println();

        System.out.println("-".repeat(space*this.productGroup.getVariableNames().length));


        for (ProductGroup product: this.products){

            if(product.productBrand.id == brandID ){
                product.printData();
                System.out.println();
            }


        }

        System.out.println("-".repeat(space*this.productGroup.getVariableNames().length));

    }



    
    public void deleteProduct(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("SİLMEK İSTEDİGHİNİZ İD");
        int id = scanner.nextInt();
        List<ProductGroup> elements= products.stream().filter(product -> product.id == id).collect(Collectors.toList());
        ProductGroup element = elements.get(0);
        products.remove(element);
    }






}
