package cz.upce.fei.nnpia.wiring.config;

import cz.upce.fei.nnpia.wiring.beans.Person;
import cz.upce.fei.nnpia.wiring.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {

    @Bean
    Vehicle vehicle() {
        Vehicle vehicle = new Vehicle();
        vehicle.setName("Toyota");
        return vehicle;
    }

    @Bean
    Person person(Vehicle vehicle) { // Using method parameters, preferovane vuci predchozimu pristupu
        Person person = new Person();
        person.setName("Lucy");
        person.setVehicle(vehicle); //manual wiring
        return person;
    }

}
