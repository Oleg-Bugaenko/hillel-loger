package coffee.order;

import lombok.Data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Data
public class Order {
    private int idOrder;
    private String nameCustomer;
    private List<String> orders = new ArrayList<>();

    public Order(int idOrder, String nameCustomer, String...orders) {
        this.idOrder = idOrder;
        this.nameCustomer = nameCustomer;
        this.orders = Arrays.asList(orders);
    }

    @Override
    public String toString() {
        return idOrder + " | " + nameCustomer;
    }

}
