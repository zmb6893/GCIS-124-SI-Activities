package Practicum_Review.Final.TrafficCircle;

import Practicum_Review.Final.TrafficCircle.Vehicle;

public class Exit {
    Vehicle vehicle;

    public Exit(){
        this.vehicle = null;
    }

    public void setVehicle(Vehicle vehicle){
        this.vehicle = vehicle;
        System.out.println(vehicle + " is at the exit of the traffic circle");
    }

    public Vehicle getVehicle(){
        return this.vehicle;
    }

    public void removeVehicle(){
        System.out.println(vehicle + " has just left the traffic circle");
        this.vehicle = null;
    }
}
