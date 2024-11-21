package Quiz2.VehicleAndTraffic;

import Quiz2.VehicleAndTraffic.trafficlight.*;
import Quiz2.VehicleAndTraffic.vehicle.*;
import Quiz2.VehicleAndTraffic.vehicle.strategy.AggressiveBehavior;
import Quiz2.VehicleAndTraffic.vehicle.strategy.BehaviorStrategy;
import Quiz2.VehicleAndTraffic.vehicle.strategy.NormalBehavior;

public class TrafficDriver {
    public static void main(String[] args) {
        TrafficLightObject trafficLight = new TrafficLight();
        BehaviorStrategy calmDef = new NormalBehavior();
        BehaviorStrategy angryDef = new AggressiveBehavior();
        Vehicle first = new Car("Ford", calmDef);
        Vehicle second = new Truck("Volvo", angryDef);

        trafficLight.addObserver(first);
        trafficLight.addObserver(second);
        trafficLight.notifyTrafficLight(trafficState.RED);
    }
}
