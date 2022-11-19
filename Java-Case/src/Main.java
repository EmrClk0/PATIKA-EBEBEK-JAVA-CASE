import java.util.LinkedHashMap;

public class Main {

    public static void main(String[] args) {


        ProductManager mobilePhoneManager = new ProductManager(new MobilePhone());
        ProductManager notebookManager = new ProductManager(new Notebook());

        mobilePhoneManager.addProduct(new MobilePhone(1,111,111,111,"İPHONE14", Brand.brands.get(2),123,321,123,32,"black"));
        mobilePhoneManager.addProduct(new MobilePhone(2,222,111,111,"s22",Brand.brands.get(0),123,321,123,32,"black"));
        mobilePhoneManager.addProduct(new MobilePhone(3,333,111,111,"s8",Brand.brands.get(0),123,321,123,32,"pink"));

        notebookManager.addProduct(new MobilePhone(1,111,111,111,"mac1",Brand.brands.get(0),32,32,32,32,"black"));
        notebookManager.addProduct(new MobilePhone(2,222,222,222,"mac2",Brand.brands.get(0),32,32,32,32,"black"));
        notebookManager.addProduct(new MobilePhone(3,33,333,333,"abra v7",Brand.brands.get(8),32,32,32,32,"black"));


        LinkedHashMap<String,ProductManager> productManagers = new LinkedHashMap<>();
        productManagers.put("Cep Telefonu",mobilePhoneManager);
        productManagers.put("Notebook",notebookManager);
        //productManagers.put("bilgisayrbileşenleri",new ProductManager(new Notebook()));




        PatikaStore store = new PatikaStore(new BrandController(),productManagers);
        store.openTheStore();














    }
}
