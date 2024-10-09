import java.util.Arrays;

public class pr39 {

    // Generic method to sort an array of Comparable objects
    public static <T extends Comparable<T>> void sort(T[] array) {
        Arrays.sort(array);
    }

    public static void main(String[] args) {
        // Example with products (assuming Product implements Comparable)
        Product[] products = {
            new Product("Product1", 10.99, 4.5),
            new Product("Product2", 8.99, 4.7),
            new Product("Product3", 12.49, 4.2)
        };

        // Sort by price or other natural ordering
        sort(products);
        for (Product product : products) {
            System.out.println(product);
        }

        // Example with another type, e.g., Customers
        Customer[] customers = {
            new Customer("Alice"),
            new Customer("Bob"),
            new Customer("Charlie")
        };

        // Sort by name or other natural ordering
        sort(customers);
        for (Customer customer : customers) {
            System.out.println(customer);
        }
    }
}

// Example Product class implementing Comparable
class Product implements Comparable<Product> {
    private String name;
    private double price;
    private double rating;

    public Product(String name, double price, double rating) {
        this.name = name;
        this.price = price;
        this.rating = rating;
    }

    @Override
    public int compareTo(Product other) {
        return Double.compare(this.price, other.price); // Sort by price
    }

    @Override
    public String toString() {
        return name + " - $" + price + " - " + rating + " stars";
    }
}

// Example Customer class implementing Comparable
class Customer implements Comparable<Customer> {
    private String name;

    public Customer(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Customer other) {
        return this.name.compareTo(other.name); // Sort by name
    }

    @Override
    public String toString() {
        return name;
    }
}