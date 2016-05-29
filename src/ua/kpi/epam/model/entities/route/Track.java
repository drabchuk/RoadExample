package ua.kpi.epam.model.entities.route;

import java.util.ArrayList;
import java.util.Date;
import java.util.SortedMap;
import java.util.TreeMap;

/**
 * Created by Денис on 20.05.2016.
 *
 * This class is a track
 * Consists of sequence of destinations
 */
public class Track {

    TreeMap<Date, Destination> spaceTimeEvents;

    public Track() {
        this.spaceTimeEvents = new TreeMap<>();
    }

    public void addEvent(Date date, Destination destination) {
        spaceTimeEvents.put(date, destination);
    }

    public SortedMap<Date, Destination> getTrackInPeriod(Date from, Date to) {
        return spaceTimeEvents.subMap(from, to);
    }

}
