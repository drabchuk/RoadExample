package ua.kpi.epam.model.entities.route;

import com.sun.org.apache.xerces.internal.impl.dv.xs.DateTimeDV;

import java.util.Date;

/**
 * Created by Денис on 20.05.2016.
 */
public class SpaceTimeEvent implements Comparable{
    private Destination destination;
    private Date date;

    public SpaceTimeEvent(Destination destination, Date date) {
        this.destination = destination;
        this.date = date;
    }

    public Destination getDestination() {
        return destination;
    }

    public Date getDate() {
        return date;
    }

    @Override
    public int compareTo(Object o) {
        return getDate().compareTo(((SpaceTimeEvent) o).getDate());
    }
}
