package jedla.demo.shop.employes;

import jedla.demo.shop.goods.Good;

import java.util.List;

public class PartTimeEmploye implements Position, InventoryWork{
    private static String positon = "Part-time employee";

    private String name;
    private int age;
    private double salary;

    public PartTimeEmploye(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
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

    @Override
    public void WhoAmI() {
        System.out.println("Hi I'm " + positon + " " + name);
    }

    @Override
    public void addGood(Good inventory, List<Good> goodList) {
        goodList.add(inventory);
    }
}
