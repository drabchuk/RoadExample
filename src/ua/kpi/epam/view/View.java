package ua.kpi.epam.view;

public class View {

    public void printMessage(String message){
        System.out.println(message);
    }

    public void printMessades(String... messages) {
        for (String m: messages) {
            System.out.println(m);
        }
    }

    public void printMessades(Object... messages) {
        for (Object m: messages) {
            System.out.println(m.toString());
        }
    }

}
