package aruw.bean;

public abstract class Vehicle {


    private double length;
    private double width;
    private double height;
    private double curbWeight;// peso vacio
    private double headRoom;
    private double legRoom;
    private double shoulderRoom;
    private double fuelTankCapacity;
    private int passenger;

    private Engine engine;
    private Transmission transmission;
    private Traction traction;

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getCurbWeight() {
        return curbWeight;
    }

    public void setCurbWeight(double curbWeight) {
        this.curbWeight = curbWeight;
    }

    public double getHeadRoom() {
        return headRoom;
    }

    public void setHeadRoom(double headRoom) {
        this.headRoom = headRoom;
    }

    public double getLegRoom() {
        return legRoom;
    }

    public void setLegRoom(double legRoom) {
        this.legRoom = legRoom;
    }

    public double getShoulderRoom() {
        return shoulderRoom;
    }

    public void setShoulderRoom(double shoulderRoom) {
        this.shoulderRoom = shoulderRoom;
    }

    public double getFuelTankCapacity() {
        return fuelTankCapacity;
    }

    public void setFuelTankCapacity(double fuelTankCapacity) {
        this.fuelTankCapacity = fuelTankCapacity;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    public int getPassenger() {
        return passenger;
    }

    public void setPassenger(int passenger) {
        this.passenger = passenger;
    }

    public Traction getTraction() {
        return traction;
    }

    public void setTraction(Traction traction) {
        this.traction = traction;
    }
}
