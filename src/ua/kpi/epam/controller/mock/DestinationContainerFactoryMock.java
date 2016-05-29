package ua.kpi.epam.controller.mock;

import ua.kpi.epam.model.entities.entitiesContainer.DestinationsContainer;
import ua.kpi.epam.model.entities.route.Destination;
import ua.kpi.epam.model.entities.route.ground.CrossRoad;

/**
 * Created by Денис on 20.05.2016.
 */
public class DestinationContainerFactoryMock {

    public static DestinationsContainer generate() {
        DestinationsContainer dc = new DestinationsContainer();
        dc.add(new CrossRoad("Cross Franka and Hmelnitskogo", 1, 1));
        dc.add(new CrossRoad("Cross Franka and Yaroslaviv val", 2, 2));
        dc.add(new CrossRoad("Cross Peremphy and Sholudenka", 3, 4));
        return dc;
    }

}
