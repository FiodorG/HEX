package order;

import asset.HouseID;
import customer.CustomerID;

public class OrderSell extends Order
{
    public OrderSell(String id, CustomerID customer_id, HouseID house_id)
    {
        super(id, customer_id, house_id);
    }
}
