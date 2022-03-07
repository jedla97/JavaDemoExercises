package jedla.demo.shop.employes;

import jedla.demo.shop.goods.Good;

import java.util.List;

public class FullTimeEmploye implements Position, SellerWork, InventoryWork{
    private static String positon = "Full time employee";

    private String name;
    private int age;
    private double salary;

    public FullTimeEmploye(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    /**
     * Spočítá celkovou hodnotu zboží v poli
     * Jelikož je to statická metoda nebude potřeba vytvářet žádný objekt
     * @param goodList pole zboží zboží
     * @return celkovou hodnotu vstupního listu zboží
     */
    public static double askEmployeForTotalInBasket(List<Good> goodList) {
        double total = 0;
        for (Good good : goodList) {
            total = total + good.getPriceWithTax();
        }
        return total;
    }

    // začátek getters and setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // konec getters and setters

    /**
     * Implementovaná metoda z rozhraní Position
     */
    @Override
    public void WhoAmI() {
        System.out.println("Hi I'm " + positon + " " + name);
    }

    /**
     * Implementovaná metoda z rozhraní InventoryWork
     */
    @Override
    public void addGood(Good inventory, List<Good> goodList) {
        goodList.add(inventory);
    }

    /**
     * Implementovaná metoda z rozhraní SellerWork
     */
    @Override
    public void sellGoods(List<Good> sellList, List<Good> goodList) {
        for (Good good : sellList) {
            goodList.remove(good);
        }
    }
}
