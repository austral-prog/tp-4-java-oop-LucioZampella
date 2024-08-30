package com.template;

public class Elevator {
    int minFloor;
    int maxFloor;
    int currentFloor;
    int maxPassenger;
    int currentPassenger;

    public Elevator(int minFloor, int maxFloor, int maxPassenger) {
        this.minFloor = minFloor;
        this.maxFloor = maxFloor;
        this.maxPassenger = maxPassenger;
        this.currentFloor = minFloor;
        this.currentPassenger = 0;
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public int moveToFloor(int floor) {
        if (floor >= this.minFloor && floor <= this.maxFloor) {
            this.currentFloor = floor;
        }
        return currentFloor;
    }
    public int getPassengerCount() {
        return currentPassenger;
    }
    public int addPassenger(int passenger) {
        if (this.currentPassenger + passenger > this.maxPassenger) {
            passenger = 0;
        }
        else {
            this.currentPassenger += passenger;
        }
        return currentPassenger;
    }
    public int removePassenger(int passenger) {
        this.currentPassenger -= passenger;
        return currentPassenger;
    }
    public int moveToUnreachableFloor(int floor) {
        if (floor >= this.maxFloor) {
            floor = 0;
        }
        return currentFloor;
    }
    public int addPassengerToFullElevator(int passenger) {
        if (this.currentPassenger >= this.maxPassenger) {
            passenger = 0;
        }
        return currentPassenger;
    }
}
