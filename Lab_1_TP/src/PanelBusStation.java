import javax.swing.*;
import java.awt.*;

public class PanelBusStation extends JPanel {

    private final BusStationCollection busStationCollection;
    private String selectedItem = null;

    protected void paintComponent(Graphics g) {
        if (selectedItem != null) {
            Graphics2D g2 = (Graphics2D) g;
            if (busStationCollection != null) {
                busStationCollection.get(selectedItem).drawBusStation(g2);

            }
        }
    }

    public void setSelectedItem(String selectedItem) {
        this.selectedItem = selectedItem;
    }

    public PanelBusStation(BusStationCollection busStationCollection) {
        this.busStationCollection = busStationCollection;
    }
}