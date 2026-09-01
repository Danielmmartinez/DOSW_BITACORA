public class OrderBuilder {

    private String size;
    private String meat;

    public OrderBuilder setSize(
            String size) {

        this.size = size;
        return this;
    }

    public OrderBuilder setMeat(
            String meat) {

        this.meat = meat;
        return this;
    }

    public Order build() {

        return new Order(
                size,
                meat
        );
    }
}