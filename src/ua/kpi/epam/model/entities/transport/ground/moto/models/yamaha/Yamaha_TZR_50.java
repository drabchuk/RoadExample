package ua.kpi.epam.model.entities.transport.ground.moto.models.yamaha;

import ua.kpi.epam.model.entities.route.Route;
import ua.kpi.epam.model.entities.transport.TypeIdentifiers;
import ua.kpi.epam.model.entities.transport.ground.moto.Motorcycle;

/**
 * Created by Денис on 20.05.2016.
 */
public class Yamaha_TZR_50 extends Motorcycle {

    public Yamaha_TZR_50(String numberPlate) {
        super(numberPlate);
    }

    @Override
    public String getBrand() {
        return "YAMAHA";
    }

    @Override
    public String getModel() {
        return "TZR 50";
    }

    @Override
    public String getNumberPlate() {
        return super.getNumberPlate();
    }

    @Override
    protected void setNumberPlate(String numberPlate) {
        super.setNumberPlate(numberPlate);
    }

    @Override
    public String getIdentificationName() {
        StringBuffer idName = new StringBuffer(super.getIdentificationName());
        idName.append(TypeIdentifiers.SEPARATOR);
        idName.append(getBrand());
        idName.append(TypeIdentifiers.SEPARATOR);
        idName.append(getNumberPlate());
        return idName.toString();
    }

    @Override
    public void move(Route route) throws IllegalArgumentException {
        super.move(route);
    }
}
