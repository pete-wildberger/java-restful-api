package hello;

public class Base {

    private final long bid;
    private final String bcontent;

    public Base(long bid, String bcontent) {
        this.bid = bid;
        this.bcontent = bcontent;

    }

    public long getBid() {
        return bid;
    }

    public String getContent() {
        return bcontent;
    }
}
