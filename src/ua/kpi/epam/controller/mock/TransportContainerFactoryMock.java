package ua.kpi.epam.controller.mock;

import ua.kpi.epam.model.entities.entitiesContainer.TransportsContainer;
import ua.kpi.epam.model.entities.transport.ground.moto.models.yamaha.*;

/**
 * Created by Денис on 20.05.2016.
 */
public class TransportContainerFactoryMock {

    public static TransportsContainer generate() {
        TransportsContainer tc = new TransportsContainer();
        tc.add(new Yamaha_YZF_R1("CA 234-34 B"));
        tc.add(new Yamaha_YZF_R1("CB 334-35 C"));
        tc.add(new Yamaha_YZF_R1("CC 434-36 D"));
        tc.add(new Yamaha_TZR_50("CD 534-11 E"));
        tc.add(new Yamaha_TZR_50("CE 634-22 F"));
        tc.add(new Yamaha_TZR_50("FF 734-33 G"));
        return tc;
    }

}
