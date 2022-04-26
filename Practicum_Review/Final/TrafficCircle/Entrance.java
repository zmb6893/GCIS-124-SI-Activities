package Practicum_Review.Final.TrafficCircle;

import Practicum_Review.Final.TrafficCircle.Vehicle;

public class Entrance {
    private Vehicle vehicle;

    public Entrance(){
        this.vehicle = null;
    }

    public void setVehicle(Vehicle vehicle){
        this.vehicle = vehicle;
        System.out.println(vehicle + " has just entered the traffic circle");
    }

    public Vehicle getVehicle(){
        return this.vehicle;
    }

    public void removeVehicle(){
        System.out.println(vehicle + " is in traffic circle");
        this.vehicle = null;
    }
}
