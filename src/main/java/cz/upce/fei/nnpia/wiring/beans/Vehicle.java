package cz.upce.fei.nnpia.wiring.beans;

public class Vehicle {

    private String name;

    public Vehicle() {
        System.out.println("Vehicle bean created by Spring");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void seyHello() {
        System.out.println("hello from component Vehicle bean");
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                '}';
    }
}
