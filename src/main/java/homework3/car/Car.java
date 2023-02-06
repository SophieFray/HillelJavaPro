package src.main.java.homework3.car;

public class Car {

    private void startElectricity() {
        System.out.println("Starting Electricity...");
    }

    private void startCommand() {
        System.out.println("Starting ...");
    }

    private void startFuelSystem() {
        System.out.println("Starting Fuel System...");
    }

    public void start() {

        startElectricity();
        startFuelSystem();
        startCommand();

    }


}
