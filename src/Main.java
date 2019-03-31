import asset.HouseID;
import auction.Auction;
import customer.CustomerID;
import matchingengine.MatchingEngine;
import order.OrderSell;

public class Main {

    public static void main(String[] args)
    {
        System.out.println("Hello World!");

        MatchingEngine engine = new MatchingEngine();

        CustomerID customer_id = new CustomerID("Customer1");
        HouseID house_id = new HouseID("House1");

        OrderSell order = new OrderSell("Order1", customer_id, house_id);
        Auction auction = new Auction("Auction1", 100, order);

        engine.add_auction(auction);
    }
}
