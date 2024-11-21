package Quiz2.VehicleAndTraffic.vehicle;

import Quiz2.VehicleAndTraffic.trafficlight.trafficState;
import Quiz2.VehicleAndTraffic.vehicle.strategy.*;

public interface Vehicle {
    String getName();

    void setName(String name);

    void update(trafficState state);
}
