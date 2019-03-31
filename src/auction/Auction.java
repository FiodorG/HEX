package auction;

import order.Order;

public class Auction
{
    private String id;
    private Integer time_duration;
    private Order order;

    public Auction (String id, Integer time_duration, final Order order)
    {
        this.id = id;
        this.time_duration = time_duration;
        this.order = order;
    }
}
