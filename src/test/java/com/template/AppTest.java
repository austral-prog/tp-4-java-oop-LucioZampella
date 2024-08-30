package com.template;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ElevatorTest {

    @Test
    void testMoveToFloor() {
        Elevator elevator = new Elevator(0, 10, 10);
        elevator.moveToFloor(5);
        assertEquals(5, elevator.getCurrentFloor());
    }

    @Test
    void testAddPassenger() {
        Elevator elevator = new Elevator(0, 10, 10);
        elevator.addPassenger(1);
        assertEquals(1, elevator.getPassengerCount());
    }

    @Test
    void testRemovePassenger() {
        Elevator elevator = new Elevator(0, 10, 10);
        elevator.addPassenger(1);
        elevator.addPassenger(1);
        elevator.removePassenger(1);
        assertEquals(1, elevator.getPassengerCount());
    }

    @Test
    void testMoveToUnreachableFloor() {
        Elevator elevator = new Elevator(0, 10, 10);
        elevator.moveToFloor(1);
        elevator.moveToFloor(15);
        assertEquals(1, elevator.getCurrentFloor());
    }

    @Test
    void testAddPassengerToFullElevator() {
        Elevator elevator = new Elevator(0, 10, 1);
        elevator.addPassenger(1);
        elevator.addPassenger(1);
        assertEquals(1, elevator.getPassengerCount());
    }
}
