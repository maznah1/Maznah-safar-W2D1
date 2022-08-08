package Package;

public class Customer {
    private int id;
    private System name;
    private int discount;




    public Customer(int id,String name,int discount){}


    public int getId() {
        return id;
    }

    public System getName() {
        return name;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name=" + name +
                ", discount=" + discount +
                '}';
    }
}
