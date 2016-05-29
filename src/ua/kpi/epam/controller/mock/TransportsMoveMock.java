package ua.kpi.epam.controller.mock;

import ua.kpi.epam.model.entities.entitiesContainer.DestinationsContainer;
import ua.kpi.epam.model.entities.entitiesContainer.TransportsContainer;
import ua.kpi.epam.model.entities.transport.Transport;

import java.util.LinkedList;

/**
 * Created by Денис on 20.05.2016.
 */
public class TransportsMoveMock {

    public static void mockMove(DestinationsContainer destinations
            , TransportsContainer transport) {
        try {
            LinkedList<Transport> transports =
                    transport.getTransportsByType(Transport.class);
            Object[] transportsArray = transports.toArray();
            ((Transport) transportsArray[0]).moveTo(
                    destinations.getByName("Cross Franka and Hmelnitskogo"));
            Thread.sleep(100);


            ((Transport) transportsArray[0]).moveTo(
                    destinations.getByName("Cross Franka and Yaroslaviv val"));
            Thread.sleep(100);

            ((Transport) transportsArray[1]).moveTo(
                    destinations.getByName("Cross Franka and Hmelnitskogo"));
            Thread.sleep(100);

            ((Transport) transportsArray[1]).moveTo(
                    destinations.getByName("Cross Peremphy and Sholudenka"));
            Thread.sleep(100);

            ((Transport) transportsArray[2]).moveTo(
                    destinations.getByName("Cross Franka and Hmelnitskogo"));
            Thread.sleep(100);

            ((Transport) transportsArray[2]).moveTo(
                    destinations.getByName("Cross Franka and Yaroslaviv val"));
            Thread.sleep(100);

            ((Transport) transportsArray[3]).moveTo(
                    destinations.getByName("Cross Franka and Hmelnitskogo"));
            Thread.sleep(100);

            ((Transport) transportsArray[0]).moveTo(
                    destinations.getByName("Cross Franka and Yaroslaviv val"));
            Thread.sleep(100);

            ((Transport) transportsArray[4]).moveTo(
                    destinations.getByName("Cross Peremphy and Sholudenka"));
            Thread.sleep(100);

            ((Transport) transportsArray[5]).moveTo(
                    destinations.getByName("Cross Peremphy and Sholudenka"));
            Thread.sleep(100);

            ((Transport) transportsArray[0]).moveTo(
                    destinations.getByName("Cross Peremphy and Sholudenka"));
            Thread.sleep(100);

            ((Transport) transportsArray[0]).moveTo(
                    destinations.getByName("Cross Franka and Yaroslaviv val"));
            Thread.sleep(100);

            ((Transport) transportsArray[0]).moveTo(
                    destinations.getByName("Cross Peremphy and Sholudenka"));
            Thread.sleep(100);

        } catch (Exception e) {
            System.out.println("Imitation of moving failed!");
        }

    }

}
