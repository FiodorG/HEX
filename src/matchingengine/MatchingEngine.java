package matchingengine;

import auction.Auction;
import java.util.ArrayList;

public class MatchingEngine
{
    private ArrayList<Auction> auctions;

    public MatchingEngine()
    {
        this.auctions = new ArrayList<>();
    }

    public ArrayList<Auction> getAuctions()
    {
        return this.auctions;
    }

    public void add_auction(final Auction auction)
    {
        this.auctions.add(auction);
    }
}
