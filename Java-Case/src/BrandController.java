import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Stream;

public class BrandController {

    public static boolean isBrandExist(Brand newBrand){
        boolean isExist = Brand.brands.stream().anyMatch(brand -> brand.id == newBrand.id );
        return isExist;
    }

    public static void addBrandToStore(Brand newBrand){
        if(!isBrandExist(newBrand))
            Brand.brands.addLast(newBrand);
        else
            System.out.println("The brand is already in system");
    }

    public  static void removeBrands(int brandId){
        Optional<Brand> removingBrand = Brand.brands.stream().filter(brand -> brand.id==brandId).findFirst();
        Brand.brands.remove(removingBrand.get());
    }

    public static void showAllBrands(){                                                     // ALFABETİK BRAND GÖSTERME
        Stream<Brand> sortedList = Brand.brands.stream().sorted(new Comparator<Brand>() {
            @Override
            public int compare(Brand o1, Brand o2) {
                return o1.name.compareTo(o2.name);
            }
        });

        System.out.println("Markalarımız\n" + "--------------\n");
        sortedList.forEach(brand -> System.out.println(brand.name));
    }



    public static void showAllBrandsWithIndex(){                                            //Index numaralarına göre marka gösterme
        for (Brand brand : Brand.brands) {
            System.out.println("id: "+brand.id +"  marka adı: "+brand.name);
        }
    }
}
