package Quiz2.VehicleAndTraffic.vehicle.strategy;

import Quiz2.VehicleAndTraffic.trafficlight.trafficState;

public interface BehaviorStrategy {
    public String getAction(trafficState state);
}
