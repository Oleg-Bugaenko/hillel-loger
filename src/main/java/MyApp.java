import coffee.order.CoffeeOrderBoard;
import exeption.ErrorNameCustomer;

public class MyApp {
    public static void main(String[] args) throws ErrorNameCustomer {
        CoffeeOrderBoard orderBoard = new CoffeeOrderBoard();

        orderBoard.add("Alex", "Coffee", "Burger", "Cake");
        orderBoard.add("Ann", "Tea", "Cake");
        orderBoard.add(null, "Apple juice");

        orderBoard.deliver();
        orderBoard.deliver(2);
        orderBoard.deliver(5);

       // System.out.println(orderBoard.deliver());
       // System.out.println(orderBoard.deliver(2));
       // System.out.println(orderBoard.deliver(5));

    }

}
