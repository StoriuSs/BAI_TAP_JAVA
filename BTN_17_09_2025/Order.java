public class Order {
    private Customer customer;
    private Product[] products;
    private int productCount;
    private static int orderCount = 0;

    public Order(Customer customer, int maxProducts) {
        this.customer = customer;
        this.products = new Product[maxProducts]; 
        this.productCount = 0;
        orderCount++;
    }

    public void addProduct(Product product) {
        if (productCount < products.length) {
            products[productCount] = product;
            productCount++;
        } else {
            System.out.println("Maximum product limit reached.");
        }
    }

    public double calculateTotal() {
        double total = 0;
        for (int i = 0; i < productCount; i++) {
            total += products[i].getPrice();
        }
        return total;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Product[] getProducts() {
        return products;
    }

    public int getProductCount() {
        return productCount;
    }

    public static int getOrderCount() {
        return orderCount;
    }
}
