package Quiz2.VehicleAndTraffic.vehicle.strategy;

import Quiz2.VehicleAndTraffic.trafficlight.trafficState;

public class NormalBehavior implements BehaviorStrategy {
    public String getAction(trafficState state) {
        return switch (state) {
            case GREEN -> "Go";
            case YELLOW -> "Slow";
            case RED -> "Stop";
        };
    }
}
