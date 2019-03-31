package order;

import asset.HouseID;
import customer.CustomerID;

public class OrderBid extends Order
{
    public OrderBid(String id, CustomerID customer_id, HouseID house_id)
    {
        super(id, customer_id, house_id);
    }
}
