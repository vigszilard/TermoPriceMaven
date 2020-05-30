public enum Spacer {

    AL16("AL16", 1.),
    AL18("AL18", 1.1),

    ;

    private double price;
    private String name;

    Spacer(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
}
