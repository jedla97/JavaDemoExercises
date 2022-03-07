package jedla.demo.shop.goods;

public class Hoodie extends Good{
    String size;

    /**
     * Konstruktor předává cenu a jméno do třídy Good a stanovuje lokální atribut velikosti
     */
    public Hoodie(double priceWithoutTax, String name, String size) {
        super(priceWithoutTax, name);
        this.size = size;
    }

    @Override
    public String toString() {
        return this.getName() + ", size='" + size;
    }

    public String getSize() {
        return size;
    }
}
