import java.time.LocalDate;

public class Customer {
    private String customerName;
    private int ruaCat;
    private int arrivalTime;
    LocalDate arivalTime = LocalDate.now();

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getRuaCat() {
        return ruaCat;
    }

    public void setRuaCat(int ruaCat) {
        this.ruaCat = ruaCat;
    }

    public int getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(int arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public LocalDate getArivalTime() {
        return arivalTime;
    }

    public void setArivalTime(LocalDate arivalTime) {
        this.arivalTime = arivalTime;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "上帝(顾客)的姓名为:" + customerName + '\n' +
                ", rua了" + ruaCat +"次猫猫\n"+
                "到店时间为:" + arivalTime +
                '}';
    }
}
