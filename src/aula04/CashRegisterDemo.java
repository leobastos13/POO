package aula04;


import java.util.ArrayList;

class Product {
    private String name;
    private double price;
    private int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public double getTotalValue() {
        return price * quantity;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int  getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return String.format("%10s %10.2f %10d %10.2f\n",
        this.name,
        this.price,
        this.quantity,
        this.price * this.quantity);
    }
}


class CashRegister {
    public ArrayList<Product> products = new ArrayList<Product>();

    public void addProduct(Product p) {
        products.add(p);

    }

    @Override
    public String toString() {
        String print = String.format("%10s %10s %10s %10s\n", "Product","Price", "Quantity","Total");;
        for (Product product : products) {
            print += product.toString();
        }
        return print;
    }
}

public class CashRegisterDemo {

    public static void main(String[] args) {
        
        
        CashRegister cr = new CashRegister();
        
        cr.addProduct(new Product("Book", 9.99, 3));
        cr.addProduct(new Product("Pen", 1.99, 10));
        cr.addProduct(new Product("Headphones", 29.99, 2));
        cr.addProduct(new Product("Notebook", 19.99, 5));
        cr.addProduct(new Product("Phone case", 5.99, 1));
        
        
        System.out.println(cr);

    }
}