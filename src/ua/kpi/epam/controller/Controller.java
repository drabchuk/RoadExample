package ua.kpi.epam.controller;

import java.util.Date;

import ua.kpi.epam.controller.mock.DestinationContainerFactoryMock;
import ua.kpi.epam.controller.mock.TransportContainerFactoryMock;
import ua.kpi.epam.controller.mock.TransportsMoveMock;
import ua.kpi.epam.model.*;
import ua.kpi.epam.model.entities.entitiesContainer.DestinationsContainer;
import ua.kpi.epam.model.entities.entitiesContainer.Searcher;
import ua.kpi.epam.model.entities.entitiesContainer.TransportsContainer;
import ua.kpi.epam.model.entities.transport.ground.moto.Motorcycle;
import ua.kpi.epam.view.*;

/**
 * Created by User on 17.03.2016.
 */
public class Controller {

    // Constructor
    Model model;
    View view;

    public Controller(Model model, View view) {
        this.model  = model;
        this.view = view;
    }

    // The Work method
    public void processUser(){

        int howManyMotos = model.countTransportTypesPassedDest(
                Motorcycle.class
                , "Cross Franka and Hmelnitskogo"
                , new Date()
        );


        int howManyMotosPS = model.countTransportTypesPassedDest(
                Motorcycle.class
                , "Cross Peremphy and Sholudenka"
                , new Date()
        );

        int howManyMotosPY = model.countTransportTypesPassedDest(
                Motorcycle.class
                , "Cross Franka and Yaroslaviv val"
                , new Date()
        );

        boolean isYamahaPassedFH =
                model.hasOnePassedDest(
                        "MOT YAMAHA FF 734-33 G"
                        , "Cross Franka and Hmelnitskogo"
                        , new Date()
                );

        boolean isYamaha2PassedFH =
                model.hasOnePassedDest(
                        "MOT YAMAHA CA 234-34 B"
                        , "Cross Franka and Hmelnitskogo"
                        , new Date()
                );

        view.printMessades("motos Cross Franka and Hmelnitskogo: " + howManyMotos);
        view.printMessades("motos Cross Peremphy and Sholudenka: " + howManyMotosPS);
        view.printMessades("YAMAHA CA 234-34 B Cross Franka and Hmelnitskogo: " + isYamaha2PassedFH);
        view.printMessades("YAMAHA FF 734-33 G Cross Franka and Hmelnitskogo: " + isYamahaPassedFH);
        //view.printMessades("motos Cross Franka and Yaroslaviv val: " + howManyMotosPY);
        //view.printMessades("yamaha1 ident str: ", yamaha1.getIdentificationName());
    }

    /**
     * Imitation of transport moving
     * and creation of entities like
     * transports or destination points
     * */
    public void initStateMock() {
        TransportsContainer transportsContainer =
                TransportContainerFactoryMock.generate();
        DestinationsContainer destinationsContainer =
                DestinationContainerFactoryMock.generate();
        TransportsMoveMock.mockMove(destinationsContainer, transportsContainer);

        model.setDestinationsContainer(destinationsContainer);
        model.setTransportsContainer(transportsContainer);
    }

}
