package Quiz2.VehicleAndTraffic.vehicle.strategy;

import Quiz2.VehicleAndTraffic.trafficlight.trafficState;

public class PassiveBehavior implements BehaviorStrategy {
    public String getAction(trafficState state) {
        return switch (state) {
            case GREEN -> "Go slow";
            case YELLOW -> "Slower";
            case RED -> "Stop";
        };
    }
}
