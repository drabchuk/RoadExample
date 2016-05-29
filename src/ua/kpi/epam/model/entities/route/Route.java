package ua.kpi.epam.model.entities.route;

/**
 * Created by Денис on 20.05.2016.
 *
 * This class means route
 * from one destination to another
 */
public abstract class Route {
    private Destination from;
    private Destination to;

    public Route() {
    }

    public Route(Destination from, Destination to) throws IllegalArgumentException{
        setFrom(from);
        setTo(to);
    }

    public Destination getFrom() {
        return from;
    }

    public void setFrom(Destination from) {
        this.from = from;
    }

    public Destination getTo() {
        return to;
    }

    public void setTo(Destination to) {
        this.to = to;
    }
}
