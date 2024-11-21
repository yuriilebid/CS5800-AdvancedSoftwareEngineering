package Quiz2.VehicleAndTraffic.vehicle.strategy;

import Quiz2.VehicleAndTraffic.trafficlight.trafficState;

public class AggressiveBehavior implements BehaviorStrategy{
    @Override
    public String getAction(trafficState state) {
        return switch (state) {
            case GREEN -> "Need4Speed";
            case YELLOW -> "Faster";
            case RED -> "Slam Brake";
        };
    }
}
