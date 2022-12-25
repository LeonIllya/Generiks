package app;

public class Product<T> {

    String name;
    T qnty;
    double price;

    public Product(String name, T qnty, double price) {
        this.name = name;
        this.qnty = qnty;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public T getQnty() {
        return qnty;
    }

    public void setQnty(T qnty) {
        this.qnty = qnty;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
