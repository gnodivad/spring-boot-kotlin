import java.util.List;

public class Main {
    public static void main(String[] args) {
        Customer phil = new Customer(0, "Phil");
        CustomerDatabase db = new CustomerDatabase();
        List<Customer> customers = db.getCustomers();
        customers.add(phil);
    }
}
