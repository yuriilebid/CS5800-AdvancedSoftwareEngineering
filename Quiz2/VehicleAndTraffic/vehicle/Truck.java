package Quiz2.VehicleAndTraffic.vehicle;

import Quiz2.VehicleAndTraffic.trafficlight.trafficState;
import Quiz2.VehicleAndTraffic.vehicle.strategy.BehaviorStrategy;

public class Truck implements Vehicle {
    private String modelName;
    private BehaviorStrategy strat;

    public Truck(String modelName, BehaviorStrategy strategy) {
        this.modelName = modelName;
        this.strat = strategy;
    }

    @Override
    public String getName() {
        return this.modelName;
    }

    @Override
    public void setName(String name) {
        this.modelName = name;
    }

    @Override
    public void update(trafficState state) {
        String currentMessage = strat.getAction(state);

        System.out.println("Notified about traffic light change " + state + " Message: " + currentMessage);
    }
}
