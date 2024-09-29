package vehicles;

public class BEV extends Vehicle {
    public BEV(ElectricEngine engine, Manufacture manufacture) {
        super(engine, manufacture);
    }

    @Override
    public void ShowCharacteristics() {
        System.out.println("Vehicle Type: Battery Electric Vehicle");
        System.out.println("Engine Type: " + engine.getEngineType());
        System.out.println(manufacture);
    }
}
