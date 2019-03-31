package order;

import asset.HouseID;
import customer.CustomerID;

public class Order
{
    private String id;
    private CustomerID customer_id;
    private HouseID house_id;

    public Order(String id, CustomerID customer_id, HouseID house_id)
    {
        this.id = id;
        this.customer_id = customer_id;
        this.house_id = house_id;
    }
}