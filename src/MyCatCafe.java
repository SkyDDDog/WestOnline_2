import sun.util.resources.LocaleData;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Random;

public class MyCatCafe implements CatCafe{
    private double balance;
    private double interests;
    ArrayList<String> catList = new ArrayList<String>(9999);
    ArrayList<String> customerList = new ArrayList<String>(9999);

    //get set方法
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public ArrayList<String> getCatList() {
        return catList;
    }

    public void setCatList(ArrayList<String> catList) {
        this.catList = catList;
    }

    public ArrayList<String> getCustomerList() {
        return customerList;
    }

    public void setCustomerList(ArrayList<String> customerList) {
        this.customerList = customerList;
    }

    //构造方法
    public MyCatCafe() {
        super();
    }

    //重写接口中方法
    @Override
    public void buy(String catKind,String catName,int catAge,boolean gender,double buyCat) {         //买入猫猫
        try {
            Cat a = new Cat(catName,catAge,gender,buyCat) {

                @Override
                public String toString() {
                    return null;
                }
            };
            balance -= buyCat;
            catList.add(catName);
        }catch (CatNotFoundException | InsufficientBalanceException e){
            System.out.println(e);
        }
    }

    @Override
    public void customer(String customerName) {    //招待客户
        try {
            Customer a= new Customer();
            a.setArivalTime(LocalDate.now());
            double x = Math.random();
            double max = catList.size();
            double y = x * max;
            System.out.println("你rua了"+catList.get((int) y));
            balance += 15;
            interests += 15;
            customerList.add(customerName);
        }catch (CatNotFoundException e){
            System.out.println(e);
        }
    }

    @Override
    public void close() {       //歇业
        double todayInterest=0;
        if (LocalDate.now().isEqual(new Customer().getArivalTime())) {
//            todayInterest += new Customer().
        }
        LocalDate today = LocalDate.now();
        today.isEqual(new Customer().getArivalTime());
        System.out.println(customerList.toString());
        System.out.println("今天赚了"+interests+"钱钱哦!");
    }
}
