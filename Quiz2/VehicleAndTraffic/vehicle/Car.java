package Quiz2.VehicleAndTraffic.vehicle;

import Quiz2.VehicleAndTraffic.trafficlight.trafficState;
import Quiz2.VehicleAndTraffic.vehicle.strategy.BehaviorStrategy;

public class Car implements Vehicle {
    private String name;
    public BehaviorStrategy strat;

    public Car(String name, BehaviorStrategy behaviorStrategy) {
        this.name = name;
        this.strat = behaviorStrategy;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void update(trafficState state) {
        String currentMessage = strat.getAction(state);

        System.out.println("Notified about traffic light change " + state + " Message: " + currentMessage);
    }
}
