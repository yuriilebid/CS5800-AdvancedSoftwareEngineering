package Quiz2.VehicleAndTraffic.trafficlight;

import Quiz2.VehicleAndTraffic.vehicle.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class TrafficLight implements TrafficLightObject {
    private List<Vehicle> trafficLights;

    public TrafficLight() {
        trafficLights = new ArrayList<>();
    }

    @Override
    public void simulateDelay() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void notifyTrafficLight(trafficState state) {
        for(Vehicle observer : trafficLights) {
            observer.update(state);
        }
    }

    @Override
    public void addObserver(Vehicle observer) {
        trafficLights.add(observer);
    }
}
