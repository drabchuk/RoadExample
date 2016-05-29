package ua.kpi.epam.model.entities.entitiesContainer;

import com.sun.org.apache.bcel.internal.generic.INSTANCEOF;
import ua.kpi.epam.model.entities.transport.Transport;

import java.util.*;

/**
 * Created by Денис on 20.05.2016.
 */
public class TransportsContainer {

    HashMap<String, Transport> hashMap;

    public TransportsContainer() {
        hashMap = new HashMap<>();
    }

    public void add(Transport t) {
        hashMap.put(t.getIdentificationName(), t);
    }

    public Transport getTransportByIdentificationName(String id) {
        return hashMap.get(id);
    }

    public LinkedList<Transport> getTransportsByType(Class clazz) {
        LinkedList<Transport> transports = new LinkedList<>();

        for (Object key: hashMap.keySet().toArray()) {
            Transport t = hashMap.get((String) key);
            if(clazz.isInstance(t)) {
                transports.add(t);
            }
        }

        return transports;
    }

}
