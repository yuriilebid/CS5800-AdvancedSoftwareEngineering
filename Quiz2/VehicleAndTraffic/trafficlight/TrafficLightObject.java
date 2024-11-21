package Quiz2.VehicleAndTraffic.trafficlight;

import Quiz2.VehicleAndTraffic.vehicle.*;

import java.util.List;

public interface TrafficLightObject {
    void simulateDelay();
    public void notifyTrafficLight(trafficState state);
    public void addObserver(Vehicle observer);
}

