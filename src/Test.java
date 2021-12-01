import java.time.LocalDate;

public class Test {
    public static void main(String[] args) {
        MyCatCafe littleShop = new MyCatCafe();
        littleShop.setBalance(999999);
        Cat[] cats = new Cat[10];
        OrangeCat wsl = new OrangeCat(1,"WSL",8,true,97,true);
        BlackCat gular = new BlackCat(2,"gular",5,false,153);
        ThreeFelinae nightsongs = new ThreeFelinae(3,"nightsongs",3,true,250);
        cats[1]=wsl;
        cats[2]=gular;
        cats[3]=nightsongs;
        littleShop.catList.add(0, String.valueOf(wsl));
        littleShop.catList.add(1, String.valueOf(gular));
        littleShop.catList.add(2, String.valueOf(nightsongs));
        Customer c1 = new Customer();
//        Customer c2 = new Customer();
        c1.setCustomerName("bule_wq");
        c1.setArivalTime(LocalDate.now());
        littleShop.customer("bule_wq");
        littleShop.buy("OrangeCat","hlc",2,true,200);
        System.out.println(nightsongs.toString());
    }
}
