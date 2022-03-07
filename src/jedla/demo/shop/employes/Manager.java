package jedla.demo.shop.employes;

public class Manager implements Position {
    public static String positon = "Manager";

    private String name;
    private int age;
    private double salary;

    public Manager(String name, int age, double salary) {
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
}
