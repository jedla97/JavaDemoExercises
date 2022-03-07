package jedla.demo.shop.goods;

public abstract class Good {
    public static final double taxCoefficient = 1.21;

    private double priceWithoutTax;
    private double priceWithTax;
    private String name;

    public Good(double priceWithoutTax, String name) {
        this.priceWithoutTax = priceWithoutTax;
        this.priceWithTax = priceWithoutTax * taxCoefficient;
        this.name = name;
    }

    public double taxValue() {
        return priceWithTax - priceWithoutTax;
    }

    public void printSomeUselessInfo(String textToPrint) {
        System.out.println("Some useless text: " + textToPrint);
    }

    public double getPriceWithoutTax() {
        return priceWithoutTax;
    }

    public void setPriceWithoutTax(double priceWithoutTax) {
        this.priceWithoutTax = priceWithoutTax;
    }

    public double getPriceWithTax() {
        return priceWithTax;
    }

    public void setPriceWithTax(double priceWithTax) {
        this.priceWithTax = priceWithTax;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
