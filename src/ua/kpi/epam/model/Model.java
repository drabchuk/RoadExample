package ua.kpi.epam.model;

import ua.kpi.epam.model.entities.entitiesContainer.DestinationsContainer;
import ua.kpi.epam.model.entities.entitiesContainer.Searcher;
import ua.kpi.epam.model.entities.entitiesContainer.TransportsContainer;
import ua.kpi.epam.model.entities.transport.Transport;
import ua.kpi.epam.model.entities.transport.ground.moto.Motorcycle;

import java.util.Date;

public class Model {

    DestinationsContainer destinationsContainer;
    TransportsContainer transportsContainer;


    public int countTransportTypesPassedDest(Class<? extends Transport> c
                                            , String dpName, Date date) {
        int howMany = Searcher.countTransportTypesPassedDest(
                transportsContainer
                , c
                , destinationsContainer.getByName(dpName)
                , date);

        return howMany;
    }

    public boolean hasOnePassedDest(String idName, String dpName, Date date) {
        boolean res = Searcher.hasOnePassedDest(
                transportsContainer
                ,idName
                , destinationsContainer.getByName(dpName)
                , date);

        return res;
    }


    public void setDestinationsContainer(DestinationsContainer destinationsContainer) {
        this.destinationsContainer = destinationsContainer;
    }

    public void setTransportsContainer(TransportsContainer transportsContainer) {
        this.transportsContainer = transportsContainer;
    }
}
