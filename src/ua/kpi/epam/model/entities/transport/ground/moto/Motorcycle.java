package ua.kpi.epam.model.entities.transport.ground.moto;

import ua.kpi.epam.model.entities.route.Route;
import ua.kpi.epam.model.entities.transport.TypeIdentifiers;
import ua.kpi.epam.model.entities.transport.ground.GroundTransport;

/**
 * Created by Денис on 20.05.2016.
 */
public abstract class Motorcycle extends GroundTransport{

    private String numberPlate;
    private String brand;
    private String model;

    public Motorcycle(String numberPlate) {
        setNumberPlate(numberPlate);
    }

    public Motorcycle(String numberPlate, String brand, String model) {
        setNumberPlate(numberPlate);
        setBrand(brand);
        setModel(model);
    }

    public String getNumberPlate() {
        return numberPlate;
    }

    protected void setNumberPlate(String numberPlate) {
        this.numberPlate = numberPlate;
    }

    public String getBrand() {
        return brand;
    }

    protected void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    protected void setModel(String model) {
        this.model = model;
    }

    @Override
    public String getIdentificationName() {
        return TypeIdentifiers.MOTORCICLE;
    }

    @Override
    public void move(Route route) throws IllegalArgumentException{
        super.move(route);

    }
}
