package ua.kpi.epam.model.entities.entitiesContainer;

import ua.kpi.epam.model.entities.route.Destination;

import java.util.HashMap;

/**
 * Created by Денис on 20.05.2016.
 */
public class DestinationsContainer {

    HashMap<String, Destination> hashMap = new HashMap<>();

    public Destination getByName(String name) {
        return hashMap.get(name);
    }

    public void add(Destination d) {
        hashMap.put(d.getName(), d);
    }

}
