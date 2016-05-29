package ua.kpi.epam.model.entities.route.ground;

import ua.kpi.epam.model.entities.route.Destination;
import ua.kpi.epam.model.entities.route.Route;

/**
 * Created by Денис on 20.05.2016.
 *
 * This class is a 'city-road-track'
 * it means that transport move from one crossroad to another
 */
public class RoadTrack extends Route implements GroundRoute{

    public RoadTrack(Destination from, Destination to) throws IllegalArgumentException {
        if( !(from instanceof CrossRoad && to instanceof CrossRoad) ) {
            throw new IllegalArgumentException(
                    "RoadTrack is must be from CrossRoad to CrossRoad"
            );
        } else {
            super.setFrom(from);
            super.setTo(to);
        }
    }

    @Override
    public Destination getFrom() {
        return super.getFrom();
    }

    @Override
    public void setFrom(Destination from) {
        super.setFrom(from);
    }

    @Override
    public Destination getTo() {
        return super.getTo();
    }

    @Override
    public void setTo(Destination to) {
        super.setTo(to);
    }
}
