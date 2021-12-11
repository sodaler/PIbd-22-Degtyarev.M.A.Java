import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class BusStationCollection {

    private final Map<String, BusStation<Bus, DopDoor>> busStationStages;
    private final int pictureWidth;
    private final int pictureHeight;

    public BusStationCollection(int pictureWidth, int pictureHeight) {
        busStationStages = new HashMap<>();
        this.pictureWidth = pictureWidth;
        this.pictureHeight = pictureHeight;
    }

    public Set<String> keys() {
        return busStationStages.keySet();
    }

    public void addBusStation(String name) {
        if (!busStationStages.containsKey(name)) {
            busStationStages.put(name, new BusStation<>(pictureWidth, pictureHeight));
        }
    }

    public void deleteBusStation(String name) {
        busStationStages.remove(name);
    }

    public BusStation<Bus, DopDoor> get(String name) {
        if (busStationStages.containsKey(name)) {
            return busStationStages.get(name);
        }
        return null;
    }

    public Bus get(String name, int index) {
        if (busStationStages.containsKey(name)) {
            return busStationStages.get(name).get(index);
        }
        return null;
    }
}
