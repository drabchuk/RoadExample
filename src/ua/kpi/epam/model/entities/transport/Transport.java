package ua.kpi.epam.model.entities.transport;

import ua.kpi.epam.model.entities.route.Destination;
import ua.kpi.epam.model.entities.route.Route;
import ua.kpi.epam.model.entities.route.Track;

/**
 * Created by Денис on 19.05.2016.
 */
public interface Transport {

    Track getTrack();
    String getIdentificationName();
    void move(Route route) throws IllegalArgumentException;
    void moveTo(Destination destination) throws IllegalArgumentException;
}
