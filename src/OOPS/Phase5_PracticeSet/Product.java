package OOPS.Phase5_PracticeSet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Product implements Comparable<Product> {
    String name;
    double price;

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public int compareTo(Product other) {
        return Double.compare(this.price, other.price);
    }
    @Override
    public String toString(){
        return "Product: " + name + ", of price: " + price;
    }
}
class ProductMain {
    public static void main(String[] args) {
        List<Product> product = new ArrayList<>();

        product.add(new Product("Mac Studio M4 Ultra Max", 12_499.99));
        product.add(new Product("Apple Vision Pro 1TB", 3_899.00));
        product.add(new Product("Sony 85 Inch 8K Ultra HD TV", 9_999.99));
        product.add(new Product("Hasselblad H6D-100c Camera", 32_999.00));
        product.add(new Product("Leica M11 Monochrom", 9_195.50));

        Collections.sort(product);
        for (Product p : product) {
            System.out.println(p);
        }
    }
}