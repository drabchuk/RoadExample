package ua.kpi.epam.model.entities.route.ground;

import ua.kpi.epam.model.entities.route.Destination;

/**
 * Created by Денис on 20.05.2016.
 */
public class CrossRoad extends Destination implements GroundDestination {
    String street1;
    String street2;

    public CrossRoad(String name, double latitude, double longitude) {
        super(name, latitude, longitude);
    }

    public CrossRoad(double latitude, double longitude,
                     String street1, String street2) {
        super(latitude, longitude);
        setStreet1(street1);
        setStreet2(street2);
    }

    public String getStreet1() {
        return street1;
    }

    public void setStreet1(String street1) {
        this.street1 = street1;
    }

    public String getStreet2() {
        return street2;
    }

    public void setStreet2(String street2) {
        this.street2 = street2;
    }
}
