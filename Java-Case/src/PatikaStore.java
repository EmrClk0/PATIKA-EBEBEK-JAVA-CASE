import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PatikaStore {

    protected BrandController brandController;
    protected LinkedHashMap<String,ProductManager> productManagers;

    PatikaStore(BrandController brandController, LinkedHashMap<String,ProductManager> productManagers){
        this.brandController = brandController;
        this.productManagers = productManagers;
    }

    private void informationMessage(){
        System.out.println("PatikaStore Ürün Yönetim Paneli !");
        System.out.println("0 - Çıkış Yap");
        System.out.println("1- Marka Listele");
        int i=2;
        for(String key: productManagers.keySet()){

            System.out.println(i+" -"+key+ " İşlemleri");
            i++;
        }
    }

    private void innerSwitchCaseProcess(ProductManager productManager){
        System.out.println("0- ANA MENÜYE DÖN");
        System.out.println("1- ÜRÜNLERİ YAZDIR");
        System.out.println("2- ÜRÜN EKLE");
        System.out.println("3- ÜRÜN SİL");
        System.out.println("4- FİLTRELİ ARAMA");

        Scanner scanner = new Scanner(System.in);
        int preference2;
        do {
            try {
                System.out.print("Tercihiniz : ");
                preference2 = scanner.nextInt();
                break;
            }catch (Exception e){
                System.out.println("Hata lütfen integer bir değer giriniz... => Error Code:"+e.getMessage());
                scanner.next();

            }
        }while (true);

        switch (preference2){
            case 0:
                System.out.println();
                this.openTheStore();
                break;
            case 1:
                productManager.showProductsTable();
                this.innerSwitchCaseProcess(productManager);

                break;
            case 2:
                productManager.addProduct();
                this.innerSwitchCaseProcess(productManager);
                break;
            case 3:
                productManager.deleteProduct();
                this.innerSwitchCaseProcess(productManager);
                break;
            case 4:
                this.brandController.showAllBrandsWithIndex();
                System.out.print("marka id giriniz:");
                int id = scanner.nextInt();
                productManager.showProductsTable(id);
                this.innerSwitchCaseProcess(productManager);

                break;
            default:
                System.out.println("GEÇERSİZ SEÇİM TEKRAR SEÇİNİZ");
                this.innerSwitchCaseProcess(productManager);
                break;
        }


    }


    private void switchCaseProcess(int preference){
        int i=2;
        if(preference==0){
            System.out.println("Sistemden çıkış yapıyorsunuz.");

        }else if(preference==1){
            this.brandController.showAllBrands();
            this.openTheStore();

        }else if(i<=preference && preference<productManagers.keySet().size()+i){
            String productGroup = (String) productManagers.keySet().toArray()[preference-i];
            System.out.println("\n"+productGroup.toUpperCase()+"İŞLEMLERİNİZ "+"\n");
            this.innerSwitchCaseProcess(productManagers.get(productGroup));

        }else{
            System.out.println("Sistemde eşleşmeyen bir tercihte bulundunuz. Çıkış yapıyorsunuz.");
        }
    }



    public  void openTheStore(){

        this.informationMessage();

        Scanner scanner = new Scanner(System.in);
        int preference;


        do {
            try {
                System.out.print("Tercihiniz : ");
                preference = scanner.nextInt();
                break;
            }catch (Exception e){
                System.out.println("Hata lütfen integer bir değer giriniz... => Error Code:"+e.getMessage());
                scanner.next();
            }
        }while (true);

        this.switchCaseProcess(preference);

    }



}
