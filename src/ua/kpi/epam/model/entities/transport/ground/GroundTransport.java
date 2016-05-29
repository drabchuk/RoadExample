package ua.kpi.epam.model.entities.transport.ground;

import ua.kpi.epam.model.entities.route.Destination;
import ua.kpi.epam.model.entities.route.Route;
import ua.kpi.epam.model.entities.route.Track;
import ua.kpi.epam.model.entities.route.ground.GroundDestination;
import ua.kpi.epam.model.entities.route.ground.GroundRoute;
import ua.kpi.epam.model.entities.transport.Transport;

import java.util.Date;

/**
 * Created by Денис on 20.05.2016.
 */
public abstract class GroundTransport implements Transport {

    Track track = new Track();

    @Override
    public Track getTrack() {
        return track;
    }

    @Override
    public void move(Route route) throws IllegalArgumentException{
        if ( !(route instanceof GroundRoute) ) {
            throw new IllegalArgumentException("" +
                    "Ground transport can't move this route.");
        }
    }

    @Override
    public void moveTo(Destination destination) throws IllegalArgumentException{
        if ( !(destination instanceof GroundDestination) ) {
            throw new IllegalArgumentException("" +
                    "Ground transport can't move to this destination.");
        }
        track.addEvent(new Date(), destination);
    }
}
