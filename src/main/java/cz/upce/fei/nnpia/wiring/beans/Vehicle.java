package cz.upce.fei.nnpia.wiring.beans;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Vehicle {

    private String name;

    private final Engine engine;

    @Autowired
    public Vehicle(Engine engine) {
        this.engine = engine;
        System.out.println("Vehicle bean created by Spring");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Engine getEngine() {
        return engine;
    }

//    @Autowired
//    public void setEngine(Engine engine) {
//        this.engine = engine;
//    }

    public void seyHello() {
        System.out.println("hello from component Vehicle bean");
    }

    @PostConstruct
    public void initialize() {
        this.name = "Kia";
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                '}';
    }
}
