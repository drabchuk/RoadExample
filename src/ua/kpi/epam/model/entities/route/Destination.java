package ua.kpi.epam.model.entities.route;

/**
 * Created by Денис on 20.05.2016.
 *
 * This class means a point on earth surface
 * consists of coordinates
 */
public class Destination {
    private String name;
    private double latitude;
    private double longitude;

    public Destination(double latitude, double longitude) {
        setLatitude(latitude);
        setLongitude(longitude);
    }

    public Destination(String name, double latitude, double longitude) {
        setName(name);
        setLatitude(latitude);
        setLongitude(longitude);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }
}
