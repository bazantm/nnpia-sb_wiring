package cz.upce.fei.nnpia.wiring;

import cz.upce.fei.nnpia.wiring.beans.Engine;
import cz.upce.fei.nnpia.wiring.beans.Vehicle;
import cz.upce.fei.nnpia.wiring.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringMain {

    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Engine engine = context.getBean(Engine.class);
        Vehicle vehicle = context.getBean(Vehicle.class);

        System.out.println("Engine name from Spring Context is: " + engine.getName());
        System.out.println("Vehicle name from Spring Context is: " + vehicle.getName());
        System.out.println("Engine that Vehicle own is: " + vehicle.getEngine());

    }

}