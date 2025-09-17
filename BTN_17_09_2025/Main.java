public class Main {
    public static void main(String[] args) {
        Product product1 = new Product("Laptop", 1000.0);
        Product product2 = new Product("Desk", 300.0);
        Product product3 = new Product("Chair", 150.0);

        Customer customer1 = new Customer("Hieu Pham", "hieupham@gmail.com");

        Order order1 = new Order(customer1, 5);
        order1.addProduct(product1);
        order1.addProduct(product1);
        order1.addProduct(product2);
        order1.addProduct(product3);
        order1.addProduct(product3);

        double total1 = order1.calculateTotal();
        System.out.println("Total amount for order 1: $" + total1);
    }
}
