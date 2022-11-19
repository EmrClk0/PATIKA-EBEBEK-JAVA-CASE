import java.util.LinkedList;

public class Brand {
    protected long id;
    protected String name;


    protected static LinkedList<Brand> brands = new LinkedList<>();
    static {
        brands.add(new Brand(1,"Samsung"));
        brands.add(new Brand(2,"Lenovo"));
        brands.add(new Brand(3,"Apple"));
        brands.add(new Brand(4,"Huawei"));
        brands.add(new Brand(5,"Casper"));
        brands.add(new Brand(6,"Asus"));
        brands.add(new Brand(7,"HP"));
        brands.add(new Brand(8,"Xiaomi"));
        brands.add(new Brand(9,"Monster"));
    }


    public Brand(long id,String name){

        this.id = id;
        this.name = name;
    }
}
