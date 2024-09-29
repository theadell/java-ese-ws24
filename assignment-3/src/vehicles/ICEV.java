package vehicles;

public class ICEV extends Vehicle {
    public ICEV(CombustionEngine engine, Manufacture manufacture) {
        super(engine, manufacture);
    }

    @Override
    public void ShowCharacteristics() {
        System.out.println("Vehicle Type: Internal Combustion Engine Vehicle");
        System.out.println("Engine Type: " + engine.getEngineType());
        System.out.println(manufacture);
    }
}