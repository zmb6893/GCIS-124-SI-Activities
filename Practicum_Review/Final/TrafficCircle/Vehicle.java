package Practicum_Review.Final.TrafficCircle;

import Practicum_Review.Final.TrafficCircle.Entrance;
import Practicum_Review.Final.TrafficCircle.Exit;

// TODO: What will you need to implement for this class?
public class Vehicle {

    private String name;
    private Exit exit;
    private Entrance entrance;

    public Vehicle(String name, Entrance entrance, Exit exit){
        this.name = name;
        this.exit = exit;
        this.entrance = entrance;
    }

    // TODO: What are the shared resources going to be?

    @Override
    public String toString() {
        return name;
    }
    
}
