package ua.kpi.epam.model.entities.entitiesContainer;

import ua.kpi.epam.model.entities.route.Destination;
import ua.kpi.epam.model.entities.route.Track;
import ua.kpi.epam.model.entities.transport.Transport;

import java.util.Date;
import java.util.LinkedList;
import java.util.SortedMap;

/**
 * Created by Денис on 20.05.2016.
 */
public class Searcher {

    public static int countTransportTypesPassedDest(TransportsContainer tc, Class clazz
            , Destination dest, Date from, Date to) {

        LinkedList<Transport> selection = tc.getTransportsByType(clazz);
        int count = 0;
        for (Transport t : selection) {
            Track track = t.getTrack();
            SortedMap<Date, Destination> selectionByDate =
                    track.getTrackInPeriod(from, to);
            Object[] dates = selectionByDate.keySet().toArray();
            for (Object date : dates) {
                Destination d = selectionByDate.get(date);
                if (d == dest) {
                    count++;
                }
            }
        }

        return count;
    }

    public static int countTransportTypesPassedDest(TransportsContainer tc, Class clazz
            , Destination dest, Date today) {
        Date from = new Date(today.getYear(), today.getMonth(), today.getDate());
        Date to = new Date(today.getYear(), today.getMonth(), today.getDate() + 1);//FIXME (Calendar)

        LinkedList<Transport> selection = tc.getTransportsByType(clazz);
        int count = 0;
        for (Transport t : selection) {
            Track track = t.getTrack();
            SortedMap<Date, Destination> selectionByDate =
                    track.getTrackInPeriod(from, to);
            Object[] dates = selectionByDate.keySet().toArray();
            for (Object date : dates) {
                Destination d = selectionByDate.get(date);
                if (d == dest) {
                    count++;
                }
            }
        }

        return count;
    }

    public static boolean hasOnePassedDest(TransportsContainer tc, String idName
            , Destination dest, Date today) {
        Date from = new Date(today.getYear(), today.getMonth(), today.getDate());
        Date to = new Date(today.getYear(), today.getMonth(), today.getDate() + 1);//FIXME (Calendar)

        //LinkedList<Transport> selection = tc.getTransportsByType(clazz);
        Transport selection = tc.getTransportByIdentificationName(idName);
        Track track = selection.getTrack();
        SortedMap<Date, Destination> selectionByDate =
                track.getTrackInPeriod(from, to);
        Object[] dates = selectionByDate.keySet().toArray();
        for (Object date : dates) {
            Destination d = selectionByDate.get(date);
            if (d == dest) {
                return true;
            }
        }

        return false;
    }

}
