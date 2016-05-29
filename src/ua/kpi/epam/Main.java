package ua.kpi.epam;

import ua.kpi.epam.controller.Controller;
import ua.kpi.epam.model.Model;
import ua.kpi.epam.view.View;

public class Main {

    public static void main(String[] args) {
        // Initialization
        Model model = new Model();
        View view = new View();
        Controller controller = new Controller(model, view);
        // Run
        controller.initStateMock();
        controller.processUser();
    }

}
