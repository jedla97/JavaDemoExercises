package jedla.demo.shop.goods;

public class Bicycle extends Good {
    private static final int numberOfWheels = 2;

    private String color;

    public Bicycle(double priceWithoutTax, String name, String color) {
        super(priceWithoutTax, name);
        this.color = color;
    }

    @Override
    public void printSomeUselessInfo(String textToPrint) {
        System.out.println("Changed useless text " + textToPrint);
    }

    @Override
    public String toString() {
        return this.getName() + ", size=" + color + ", price=" + this.getPriceWithTax();
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
