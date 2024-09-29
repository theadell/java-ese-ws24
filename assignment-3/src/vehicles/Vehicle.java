package vehicles;

public abstract class Vehicle {
    protected Engine engine;
    protected Manufacture manufacture;

    public Vehicle(Engine engine, Manufacture manufacture) {
        this.engine = engine;
        this.manufacture = manufacture;
    }

    public abstract void ShowCharacteristics();
}
